package network;

import java.net.URL;

/* URL
 * Uniform Resource Locator
 * 
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html
 * https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%98%81%ED%99%94
 * 
 * 프로토콜 : https 자원에 접근하기 위해 서버와 통신하는 데 필요한 통신규칙
 * 호스트명 : search.naver.com (서버 이름)
 * 경로명 : 그 뒤에 줄줄이 나오는 것 - 접근하려는 자원이 저장된 서버상의 위치
 * 파일명 : Scanner.html
 * 쿼리 : URL에서 ? 이후의 부분 : 키=밸류&키=밸류& ... : where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%98%81%ED%99%94
 */

public class UrlEx1 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%98%81%ED%99%94");
			
			System.out.println("url.getAuthority() : "+url.getAuthority());
			System.out.println("url.getContent() : "+url.getContent());
			System.out.println("url.getDefaultPort() : "+url.getDefaultPort());
			System.out.println("url.getPort() : "+url.getPort());
			System.out.println("url.getFile() : "+url.getFile());
			System.out.println("url.getHost() : "+url.getHost());
			System.out.println("url.getPath() : "+url.getPath());
			System.out.println("url.getProtocol() : "+url.getProtocol());
			System.out.println("url.getQuery() : "+url.getQuery());
			System.out.println("url.getUserInfo() : "+url.getUserInfo());
			
			//URL을 문자열로 반환
			System.out.println("url.toExternalForm() : "+url.toExternalForm());
			
			//URL을 URI로 변환 : URI가 URL을 포함하는 관계
			System.out.println("url.toURI() : "+url.toURI());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
