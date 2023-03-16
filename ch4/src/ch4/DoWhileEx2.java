package ch4;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {
		// 1~100 사이의 임의의 숫자를 저장
		// 사용자는 임의의 숫자를 맞추는 게임
		// 임의의 숫자를 맞출 때 까지 사용자로부터 입력받기

		int answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer);
		int input = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1~100 사이의 정수를 입력해주세요 : ");
			input = Integer.parseInt(sc.nextLine());
			if (input > answer) {
				System.out.println("다운");
			} else if (input < answer) {
				System.out.println("업");
			}
		} while (input != answer);
		System.out.println("정답!");
		
		int sum = 0, j=0;
		while (true) {
			if(sum>100) break;
			++j;
			sum+=j;
		}
		System.out.println("j="+j);
		System.out.println("sum="+sum);
		sc.close();
	}
}