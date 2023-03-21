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
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static void main(String[] args) {
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//jdbc:oracle:thin:@  : 고정
			//localhost:1521:xe
			//localhost == 오라클 서버가 설치된 IP 주소
			//1521 : 포트번호. 변경 가능, 1521은 기본포트
			//xe : 기본 sid 이름, 바뀔 수도 있다
			
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				System.out.println("연결되었습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
