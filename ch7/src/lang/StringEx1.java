package lang;

/* String 클래스
 *  - 변경 불가능한(immutable) 클래스
 * 
 */

public class StringEx1 {

	public static void main(String[] args) {
		// String 클래스의 동작 구현
		// 문자열을 다루는 일이 많기 때문에 new를 사용하지 않고도 인스턴스 생성 가능하게 함
		
		//문자열 만들기 1) 문자열 리터럴 지정 2) new 사용하는 방식
		String str2 = "Hello";
		String str4 = "Hello"; 
		// 메모리 영역에 "Hello" 가 이미 있는지 먼저 찾아본다
		// 있다면, 기존 "Hello"의 주소값을 str4에도 할당함
		String str = new String("안녕하세요");
		String str3 = new String("안녕하세요");
//		str2 = str2 + str; // 기존 공간에 덧붙이는 작업 못한다. 왜? String은 불변
		// 새로운 주소에 str2+str의 결과물을 저장하고, str2는 새로운 주소값을 가진다
		System.out.println(str2);

		// 문자열 비교 equals.
		//==은 전부 주소 비교
//		String 클래스에 equals 오버라이딩 되어있음
		System.out.println(str2.equals(str)); // 스트링 값 동일한지 비교
		System.out.println(str2.equalsIgnoreCase(str)); //대소문자 구별X equals
		System.out.println(str == str3); // 문자열 비교는 == 사용 x
		System.out.println(str2 == str4); // true?? == 쓰지 말 것. 값 비교 아님

	}

}
