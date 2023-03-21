package database;

/* JDBC - (Java DataBase Connectivity)
 * 자바에서 데이터베이스에 접속할 수 있도록 제공해주는 자바 api
 * 
 * 프로젝트에 ojdbc.jar 포함되어야 함
 * [build path] - [configure build path] - [libraries] - [class path]
 * -[External jars] - C:\sqldeveloper\jdbc\lib
 * 
 * 1) connection 가져오기
 * 		- 드라이버 로드
 * 		- 연결문자열 연결 시도
 * 
 * 2) DB서버에 접속해서 원하는 작업(CRUD) 하기
 * 		- Create, Read(SELECT 여기에 해당), Update, Delete
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null; // sql문 전달
		ResultSet rs = null; // sql 결과 저장, 특히 select 결과. 테이블 형태

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// jdbc:oracle:thin:@ : 고정
			// localhost:1521:xe
			// localhost == 오라클 서버가 설치된 IP 주소
			// 1521 : 포트번호. 변경 가능, 1521은 기본포트
			// xe : 기본 sid 이름, 바뀔 수도 있다

			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

//			if (con != null) {
//				System.out.println("연결되었습니다");
//			}

			// emp 테이블에 있는 내용 가져오기
//			String sql = "SELECT * FROM EMP";
			String sql = "SELECT * FROM EMP where deptno = 20";

			// server로 sql 구문 전송
			pstmt = con.prepareStatement(sql);

			// 전송된 sql 구문을 실행 후 결과를 rs에 담기
			rs = pstmt.executeQuery();

			// ResultSet 객체 안의 한 행씩 읽어오면서 화면 출력
			// 타입에 맞게 getInt, getString 등등
			// 데이터는 열 번호나 열 이름으로 불러오기 가능
			while (rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getInt("mgr") + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.print(rs.getInt(7) + "\t");
				System.out.println(rs.getInt("deptno"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
