package ch7;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열 인덱스 잘못 지정했을 때 ==>
		// 1) if문 걸어서 확인하는 방법
		if (args.length >= 1) {
			System.out.println(args[0]);
		} else {
			System.out.println("실행방법 확인");
		}

		// 2) try catch
		// catch는 여러개 만들 수 있다 : 자식->부모 순으로 오류형태를 지정해야함
		try {
			System.out.println(args[0]);
			System.out.println(3/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행방법 확인");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		} finally {
			System.out.println("반드시 실행");
		}

	}

}
