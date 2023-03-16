package ch2;

// 논리연산자 - boolean에만 사용 가능, 결과값도 boolean으로 주어짐
// &&(AND결합) X는 10보다 크고, 20보다 작다
//			X > 10 && X < 20
// ||(OR결합) i는 2의 배수 또는 3의 배수
//			i%2==0 || i%3==0
// i 는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다.
// 			(i%2==0 || i%3==0) && i%6!=0

public class OperatorEx3 {

	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);

		if (charCode >= 65 && charCode <= 90) {
			System.out.println("대문자");
		}

		int x = 15;
		if (x > 10 && x < 20) {
			System.out.println("x는 10과 20의 사이에 있음");
		}

	}

}
