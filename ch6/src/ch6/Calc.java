package ch6;
/*클래스 구성요소
 * 멤버변수나 메소드나 생성자는 필수는 아님 (왜? 생성자는 안 만들어도 기본 생성자 자동생성)
 */

public class Calc {
	//+, -, *, / 기능이 있는 클래스 만들기
	// + : 두 개의 정수를 받아서 더하기 한 후 결과를 리턴
	// - : 두 개의 정수를 받아서 빼기 한 후 결과를 리턴
	// * : 두 개의 정수를 받아서 곱하기 한 후 결과를 리턴
	// / : 두 개의 정수를 받아서 나누기 한 후 결과를 리턴
	// int ~ long
	
	//메소드의 매개변수 - 해당 메소드 지역변수.
	int add(int num1 , int num2) {
		return num1+num2;
	}
	//리턴이 여러개 포함이 될 순 있지만 한 곳에만 도달하게 해야한다. 조건문 같은걸로
	
	int subtract(int num1 , int num2) {
		return num1-num2;
	}
	int multiply(int num1 , int num2) {
		return num1*num2;
	}
	int divide(int num1 , int num2) {
		return num1/num2;
	}

}
