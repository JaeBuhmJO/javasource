package lang;

/* Object의 toString 메소드 - 패키지명.클래스명.@hashcode값
 * 자손 클래스에서 거의 무조건 오버라이드 한다
 * 자손 toString() : 인스턴스에 대한 정보를 문자열로 제공하는 목적으로 사용
 */

/* main() 메소드를 가지고 있는 클래스
 * main() 메소드가 없는 클래스 : 다른 클래스에서 사용할 용도
 * 
 * 콘솔 프로그램 작성 시
 * ==> 화면 출력, 입력... 하려면 main() 메소드가 있는 클래스가 반드시 필요함
 */

/* String
 *  - 변경 불가능한(immutable) 클래스
 *  str2 = str2 + str; 
 *  새로운 주소에 str2+str의 결과물을 저장하고, str2는 새로운 주소값을 가진다
 *  
 * 문자열 만드는 방법
 *  1) 문자열 리터럴 지정
 *  - 문자열 재사용 함
 *  메모리에 "Hello" 가 이미 있는지 먼저 찾아보고 있으면 같은 주소를 할당
 *  2) new를 통한 인스턴스화
 *  
 *  indexOf(int ch) 주어진 문자 ch가 문자열에 들어있는지 확인하고 Index값 리턴, 없으면 -1
 *  
 *   regex : Regular expression(정규 표현식)
 *   - 특정한 규칙을 가진 문자열의 집합
 *  
 *  StringEx2에 상세 예시
 *  equals, equalsIgnoreCase,length(),charAt(),indexOf()
 *  lastIndexOf(), substring(), concat(), startsWith()
 *  endsWith(), contains(), replace()-immutable
 *  trim(), valueOf(), toLowerCase(), toUpperCase()
 *  split(), join()
 *  compareTo(), compareToIgnoreCase(),
 *  
 */

/* 자바에서 문자열 다루기
 * 1) String
 * 2) StringBuffer : 원본 문자열 변경 가능 / 멀티쓰레드 안전
 * 3) StringBuilder : 원본 문자열 변경 가능 // StringBuffer - 멀티쓰레드 클래스
 * 
 *  StringBuffer
 * append(), delete(), deleteCharAt(), insert(), replace()
 */

/* Math 클래스
 * 생성자가 없다 - 인스턴스화 불가능
 * 인스턴스.메소드() 사용이 불가능 => 모든 메서드, 필드가 static
 * 그런 클래스는 위에 import static 치고 . 를 생략할 수 있다
 * round(), ceil(), floor(), max()
 * 
 */

/* 타입
 * 기본형 : byte, int, char, long, double, boolean 등등
 * 참조형 : 배열, 클래스, 인터페이스 등등
 * 
 * Wrapper 클래스 - 기본형을 객체화하여 활용 가능
 * 
 */

/* Calendar/Date/SimpleDateFormat
 * LocalDate/LocalTime/LocalDateTime
 * 
 * 
 */

public class A_note {

}
