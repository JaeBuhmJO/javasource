package shop2;

import static shop2.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// CRUD Create Read Update Delete 메소드 작성

	public boolean insert(int userId, int productId) {
		boolean status = false;

		try {
			con = getConnection();

			String sql = "insert into sorder(order_Id, user_Id, product_Id, order_Date) "
					+ "values(ORDER_SEQ.NEXTVAL,?,?,sysdate)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, productId);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}

	public List<OrderDTO> carts(int userid) {
		List<OrderDTO> list = new ArrayList<>();

		try {
			
			con = getConnection();
			
			String sql = "SELECT O.USER_ID, U.NAME, P.INFO, O.PRODUCT_ID, "
					+ "PR.PNAME, PR.PRICE, PR.CONTENT, o.order_date " + "FROM SORDER O, SUSER U, PAYTYPE P, PRODUCT PR "
					+ "WHERE O.USER_ID = U.USER_ID AND U.PAY_NO = P.PAY_NO "
					+ "AND O.PRODUCT_ID = PR.PRODUCT_ID AND O.USER_ID=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userid);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserid(rs.getInt(1));
				userDTO.setName(rs.getString(2));
				userDTO.setType(rs.getString(3));

				ProductDTO productDTO = new ProductDTO();
				productDTO.setProductId(rs.getInt(4));
				productDTO.setPname(rs.getString(5));
				productDTO.setPrice(rs.getInt(6));
				productDTO.setContent(rs.getString(7));

				OrderDTO orderDTO = new OrderDTO();
				orderDTO.setUserDTO(userDTO);
				orderDTO.setProductDTO(productDTO);
				orderDTO.setOrderDate(rs.getDate(8));
				list.add(orderDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

}
