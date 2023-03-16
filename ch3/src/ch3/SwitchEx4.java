package ch3;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		// +,-,*,/,%

		// 사용자로부터 두 개의 피연산자와 연산자를 입력받기
		// 연산을 수행한 후 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("연산자는? ");
		String cal = sc.nextLine();
		System.out.print("두 번째 숫자 : ");
		int b = Integer.parseInt(sc.nextLine());

		switch (cal) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		case "%":
			System.out.println(a / b);
			break;
		default:
			System.out.println("연산자 입력 오류입니다.");
			break;
		}
		sc.close();

	}

}
