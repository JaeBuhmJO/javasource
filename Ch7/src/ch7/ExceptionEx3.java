package ch7;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// java.lang.ArithmeticException
		// java패키지의 lang 패키지의 ArithmeticException
		try {
			System.out.println(3 / 0);
		} catch (Exception e) { // 주로 Exception으로 다 받는다
			// 다형성, Exception은 ArithmeticException의 조상
			System.out.println("cannot divide by zero");
			System.out.println(e.getMessage()); // 자바 예외 기본메세지
			e.printStackTrace(); // 개발 과정에서 많이 쓰는 코드
			// 예외가 발생하는 구문을 추적해서 출력) - 예외가 있어도 다음코드 진행
		}

		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException e) {
			// Exception의 자식 RuntimeException의 자식 ArithmeticException
			e.printStackTrace();
		}

	}

}
