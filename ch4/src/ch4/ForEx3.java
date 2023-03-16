package ch4;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		// 팩토리얼 !
		// 숫자는 입력받아서 팩토리얼 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼 수를 입력 : ");
		int a = Integer.parseInt(sc.nextLine());

		int fac = 1;
		for (int i = a; i >= 1; i--) {
			fac *= i;
		}
		System.out.println(fac);
		System.out.printf("%d의 팩토리얼 = %d\n",a,fac);
		sc.close();
	}
}