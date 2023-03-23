package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert2 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try (Scanner scanner = new Scanner(System.in)) {

			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

			// sql문 작성
			System.out.print("부서 번호 >> ");
			int deptno = Integer.parseInt(scanner.nextLine());
			System.out.print("부서 명 >> ");
			String dname = scanner.nextLine();
			System.out.print("부서 위치 >> ");
			String loc = scanner.nextLine();

			String sql = "insert into dept_temp(deptno, dname, loc) values (?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

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
