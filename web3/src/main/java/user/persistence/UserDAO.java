package user.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.domain.UserDTO;

public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javadb";
		String password = "12345";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insert(String name, int birthYear, String addr, String mobile) {
		boolean flag = false;
		con = getConnection();
		String sql = "insert into usertbl values(user_seq.NEXTVAL, ?, ?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, birthYear);
			pstmt.setString(3, addr);
			pstmt.setString(4, mobile);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public List<UserDTO> getList() {
		List<UserDTO> list = new ArrayList<>();

		try {
			con = getConnection();

			String sql = "select * from usertbl";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String username = rs.getString("username");
				int birthyear = rs.getInt("birthyear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				list.add(new UserDTO(no, username, birthyear, addr, mobile));
//				userDTO.setNo(no);
//				userDTO.setUsername(username);
//				userDTO.setBirthYear(birthyear);
//				userDTO.setAddr(addr);
//				userDTO.setMobile(mobile);
//				list.add(userDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	public UserDTO getRow(int no) {
		UserDTO dto = null;

		try {
			con = getConnection();

			String sql = "select * from usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();
			pstmt.setInt(1, no);
			while (rs.next()) {
				String name = rs.getString("username");
				int birthYear = rs.getInt("birthyear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				dto = new UserDTO(no, name, birthYear, addr, mobile);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}

	public boolean update(String newaddr, String newmobile, int no) {
		boolean flag = false;
		try {
			con = getConnection();

			if (newaddr != "") {
				String sql = "update usertbl set addr=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, newaddr);
			}
			if (newmobile != "") {
				String sql = "update usertbl set mobile=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, newmobile);
			}
			pstmt.setInt(2, no);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public boolean remove(int no) {
		boolean flag = false;

		try {
			con = getConnection();

			String sql = "delete usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

}
