package inheritance.code;

import java.util.Date;
import java.util.Scanner;
import inheritance.Account;
/* import문
 * java 패키지의 하위 패키지 util 안의 Scanner class
 * 다른 패키지에 있는 클래스를 사용할 때 필요
 */

/* 접근 제어자(modifier) : 멤버 또는 클래스에 사용되어 
 * 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한
 * 접근 제어자가 사용되는 곳 : 클래스, 멤버변수, 메서드, 생성자
 * 접근 범위 : public > protected > default > private
 * 
 * public - 접근 제한되지 않음 : 주로 메소드, 클래스
 * protected - 같은 패키지 내 + 다른 패키지의 자손 클래스에서 접근 가능
 * default - 같은 패키지 내에서만 접근 가능. 일반적으로 입력은 생략. 
 * private - 같은 클래스 내에서만 접근 가능 : 주로 속성(멤버변수)
 * 
 * 제어자
 * static(공통적인) - 멤버변수, 메서드, 초기화블럭
 * final - 클래스, 메서드, 멤버변수, 지역변수
 * static final - 
 * 
 * abstract, ...
 */

public class Test {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account account = new Account(null, null, 0);
		
		Date date = new Date();
		
		//java.lang 패키지에 있는 클래스 사용시 import 구문 필요없음
		//자주 사용하는 패키지이기 때문에 기본 적용 되어있음
		String str = "Hello";
		scanner.close();
	}
	
}
