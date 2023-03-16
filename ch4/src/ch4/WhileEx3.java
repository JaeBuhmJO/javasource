package ch4;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		//사용자로부터 숫자를 입력받기
		//숫자의 각 자리의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int inputNum = num;
		int sum = 0;
		while (num!=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.printf("%d의 자리 합 : %d",inputNum,sum);
		
		sc.close();

	}
}