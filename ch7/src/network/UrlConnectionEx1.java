package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/* URLConnection 클래스 : 어플리케이션과 URL 간의 통신 연결을 나타내는 클래스
 * 
 */

public class UrlConnectionEx1 {

	public static void main(String[] args) {

		BufferedReader input = null;
		String line = "";

		try {
			URL url = new URL("https://www.naver.com");
			
			//url.openStream() : 연결된 url에서 데이터를 읽어 InputStream 형태로 리턴
			// InputStreamReader() : InputStream ==> Reader 변환
			
			//url.openStream 대신에 사용한다면 이렇게
			URLConnection con = url.openConnection();
			con.getInputStream();//
			
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
