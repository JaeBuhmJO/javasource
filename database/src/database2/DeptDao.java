package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/* %Dao - DATABASE 작업을 담당하는 클래스임
 * 근데 DATABASE 작업 말고는 안하고,
 * 반대로 모든 DATABASE 작업은 Dao에서 다한다
 */

public class DeptDao {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 커넥션을 위한 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
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

	public DeptDTO getRow(int deptno) {
		DeptDTO dto = null;
		try {
			con = getConnection();
			String sql = "select * from dept_temp where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
//				deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				dto = new DeptDTO(deptno, dname, loc);
//				return new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));

				dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;

	}

	public ArrayList<DeptDTO> getRows() {
		ArrayList<DeptDTO> list = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from dept_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				DeptDTO dto = new DeptDTO(deptno, dname, loc);
//				list.add(dto);
				
//				list.add(new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3)));
				
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
}
