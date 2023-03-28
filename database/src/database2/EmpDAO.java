package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

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
		} catch (Exception e) {
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

	public ArrayList<EmpDTO> getList(String value) {
		ArrayList<EmpDTO> list = new ArrayList<>();

		try {
			con = getConnection();
			// ename이 홍길동인 사람 조회
			String sql = "SELECT EMPNO, ENAME, JOB, HIREDATE " + "FROM EMP_TEMP WHERE ENAME=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, value);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt(1));
				dto.setEname(rs.getString(2));
				dto.setJob(rs.getString(3));
				dto.setHiredate(rs.getDate(4));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	public EmpDTO getRow(int empno) {
		EmpDTO dto = null;

		try {
			con = getConnection();

			String sql = "select empno, ename, job, sal, comm, deptno" + " from emp_temp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt(1));
				dto.setEname(rs.getString(2));
				dto.setJob(rs.getString(3));
				dto.setSal(rs.getInt(4));
				dto.setComm(rs.getInt(5));
				dto.setDeptno(rs.getInt(6));
			}

			// where절에 pk가 조건으로 들어오는 경우 무조건 하나의 행이 나옴
			// Primary Key : 중복 불가, null 불가한 키

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return dto;
	}

	public boolean update(int empno, int sal) {
		boolean status = false;
		try {
			con = getConnection();
			// 사번이 일치하면 급여 수정
			String sql = "update emp_temp set sal=? where empno=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);

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
	// select - many : ArrayList 리턴
	// select - one : DTO 리턴

	public boolean remove(int empno) {

		boolean status = false;
		try {
			con = getConnection();

			String sql = "delete from emp_temp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);

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

	public boolean add(EmpDTO empDTO) {
		boolean status = false;

		try {
			con = getConnection();

			String sql = "insert into emp_temp values(?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setInt(5, empDTO.getSal());
			pstmt.setInt(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());

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
}
