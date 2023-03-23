package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try (Scanner scanner = new Scanner(System.in)){
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

			System.out.print("변경할 부서코드를 입력 : ");
			int deptno = Integer.parseInt(scanner.nextLine());
			System.out.print("변경할 부서명으로 입력 : ");
			String dname = scanner.nextLine();
			String sql = "UPDATE DEPT_TEMP SET DNAME=? WHERE DEPTNO=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
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
