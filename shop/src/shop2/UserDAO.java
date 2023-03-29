package shop2;

/* JdbcUtil 메소드 호출하는 방법
 * 
 * 1. static 메소드이므로 클래스이름.메소드명()
 * 2. JdbcUtil 클래스 안 메소드가 모두 static 이라면
 * 		import static JdbcUtil.*; => 메소드()만 써도 됨
 */

import static shop2.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public boolean insert(int userid, String name, int payno) {
		boolean status = false;
		try {
			con = getConnection();

			String sql = "insert into suser values(?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userid);
			pstmt.setString(2, name);
			pstmt.setInt(3, payno);

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

	public boolean insert(UserDTO userDTO) {
		boolean status = false;
		try {
			con = getConnection();

			String sql = "insert into suser values(?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getName());
			pstmt.setInt(3, userDTO.getPayno());

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

	public List<UserDTO> getList() {
		List<UserDTO> list = new ArrayList<>();

		try {
			con = getConnection();

//			String sql = "select * from suser";
			
			String sql = "SELECT u.USER_ID, u.NAME, U.PAY_NO, p.INFO "
					+ "FROM SUSER U JOIN PAYTYPE P ON U.PAY_NO = P.PAY_NO ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserid(rs.getInt(1));
				userDTO.setName(rs.getString(2));
				userDTO.setPayno(rs.getInt(3));
				userDTO.setType(rs.getString(4));
				list.add(userDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}

		return list;
	}

}
