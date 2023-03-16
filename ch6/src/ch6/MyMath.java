package ch6;
/* 인스턴스 메소드 : 인스턴스를 생성한 후에 사용해야함
 * 
 * 클래스(static) 메소드 : 인스턴스를 생성하지 않고도 바로 사용이 가능함
 *  클래스명.메소드명()
 */

public class MyMath {
	// 멤버변수 (인스턴스 변수)
	long a, b;

	//인스턴스 변수를 활용한 사칙연산 메소드
	//인스턴스 메소드 - 클래스 내의 값을 불러들이거나 변환하거나 등
	long add() {
		return a + b;
	}

	long subtract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	//기본형 매개변수(지역변수)를 활용한 사칙연산 스태틱 메소드
		//static 메소드 안에서는 인스턴스 변수를 바로 사용할 수 없음
		//왜? 스태틱은 클래스가 메모리에 올라가는 순간 메모리에 다 올라가는데
		//그 시점에 인스턴스 변수는 아직 생성되기 전, 저장될 수 없다.
//	static long add2() {
//		return a + b;
//	}
	
	static long add(long a, long b) {
		return a + b;
	}

	static long subtract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(long a, long b) {
		return a / (double) b;
	}

}
