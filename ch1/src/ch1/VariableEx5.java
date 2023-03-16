package ch1;

import java.util.Scanner;

public class VariableEx5 {

	public static void main(String[] args) {

		/*
		 * 키보드에서 입력받기
		 */
		System.out.println("두자리 정수를 입력해 주세요");

		Scanner sc = new Scanner(System.in);
		// System.in : 키보드
		int num = Integer.parseInt(sc.nextLine());
		// sc.nextLine() : 문자열로 입력받기 / int num = sc.nextLine(); : 오류. String int에 저장 불가.
		// Integer.parseInt(null) : 괄호 안의 문자형 숫자를 숫자형으로 변환
	
		System.out.printf("입력숫자 : %d", num);
		
		sc.close();

	}

}
