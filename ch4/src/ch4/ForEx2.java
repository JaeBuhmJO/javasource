package ch4;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		// 주사위 5번 던지기

//		int dice = (int)(Math.random()*6)+1;

		for (int i = 0; i < 5; i++) {
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println(dice);
		}

		// 구구단 출력 가로버전
		// 5 * 1 = 5
		// 5 * 2 = 10 ...
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
				if (j == 9) 
					System.out.println();
			}
		}

		// 구구단 출력 세로버전
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i));
				if (j == 9)
					System.out.println();
			}
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println("5*" + i + "=" + 5 * i);
		}

		Scanner sc = new Scanner(System.in);

		System.out.printf("출력을 원하는 단을 입력하세요 : ");
		int gugu = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= 9; i++) {
			System.out.println("" + gugu + "*" + i + "=" + gugu * i);
		}

		// 3의 배수 합인데 9의 배수는 빼기

		int sum3Not9 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 9 != 0) {
				sum3Not9 += i;
			}
		}
		
		System.out.println("3의 배수지만 9의 배수는 뺀 값 = " + sum3Not9);

		// 3의 배수와 5의 배수 합 구하기 (1~ 100)

		int sum35 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum35 += i;
			}
		}
		System.out.println("3의 배수와 5의 배수의 합 = " + sum35);
		sc.close();

	}
}