package inheritance;
/* 클래스 관계
 * 상속 관계(is-a) Circle is a Point
 *  - 단일 상속. extends 다음에는 하나의 클래스만 올 수 있다
 * 포함 관계(has-a) Circle has a Point
 *  - 여러개 들어와도 전혀 상관없다.
 * 
 * 포함관계
 * 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언
 */

/* package - 패키지명은 소문자로 시작한다
 * class(인터페이스)의 묶음
 * ==> 폴더
 * 클래스 이름 - 패키지명.클래스명
 * Ex)
 * ch6.Account
 * exam.Account
 * inheritance.Account
 * java.lang.String -> package 계층. java 패키지 안의 lang 패키지
 */

/* Ex)
 * Car class
 * Engine class - has a 포함관계로 만든다
 * Door class - has a 포함관계로 만든다
 * 
 * Account 
 * BonusPointAccount 보너스 포인트 계좌는 계좌이다 - 상속 관계
 */

public class Circle {
//	int x; // x좌표
//	int y; // y좌표
	
	Point p = new Point(); // 포함관계 - 상속이랑 다름
	
	
	int r; // 반지름
	
	
	
}
