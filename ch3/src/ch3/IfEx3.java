package ch3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int input = Integer.parseInt(sc.nextLine());

		// 압축형 삼항연산
		System.out.println(input % 2 == 0 ? "짝수" : "홀수");

		// if-else
		String result = "  ";
		if (input % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println(result);
		sc.close();

	}

}
