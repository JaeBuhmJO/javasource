package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete2 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try (Scanner scanner = new Scanner(System.in)){
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

			System.out.print("삭제할 부서 번호 입력\n>");
			int deptno = scanner.nextInt();
			
			String sql = "DELETE DEPT_TEMP WHERE DEPTNO=?";
//			String sqlf = String.format("DELETE DEPT_TEMP WHERE DEPTNO=%d", input);

			pstmt = con.prepareStatement(sql);
			//? 세팅
			pstmt.setInt(1, deptno);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("삭제 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
