package ch1;

/* 1. 자바는 대소문자를 구별한다. Hello != hello 
 * 2. 들여쓰기 확실하게 하자 
 * 3. 단축키 알아서 쓸것 
 * 4. 작성 코드 : 메모리에 로드되고, 실행 메모리 주소는 16진수 형태 (알아서 됨) 
 * -> 그래서 '변수' 라는 것을 지정한다.ㅜ
 */

/* 자바는 클래스 생성이 기본 : 클래스 이름은 대문자로 시작되는 것이 약속
* 결과 출력 : main 메소드 필수
*/

public class Hello {

	public static void main(String[] args) {
		
		// ctrl+space : 자동완성
		// ctrl+alt+up/down : 복사
		
		System.out.println("Hello");
		System.out.println("hello");

		// System.out.print 와 System.out.println 차이는 결과창 엔터 차이
		System.out.print("안녕하세요");
		System.out.print("안녕하세요");
	}

}
