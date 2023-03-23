package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {

		// insert, update, delete 작업은 두 객체만 사용하면 됨
		// DML 작업 시 성공한 행의 개수만 전달받게 됨 - resultset 기능이 필요 없음. 실패시 0 반환.
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

			// sql문 작성
			String sql = "insert into dept_temp(deptno, dname, loc) values (55,'NETWORK','SEOUL')";

			pstmt = con.prepareStatement(sql);

			// select: executeQuery(), DML : executeUpdate()
			int count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("입력 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

}
