package ch3;

import java.util.Scanner;

/* 조건문
 * 조건식과 실행될 하나의 문장 또는 블럭으로 구성됨
 * 종류 : if(주로 사용), switch
 * 조건 : true/false로 판별되어야 함
 * 
 * 1. if
 */

//if 문
//if (condition) {
//	//블럭구간은 조건이 true일 때만 실행된다
//}

//if-else 문
//if (condition) {
//	//블럭구간은 조건이 true일 때만 실행된다
//}else {
//	//블럭구간은 조건이 true가 아닐 때만 실행된다
//}

//if-else if 문
//if (condition) {
//	//조건이 true일 때
//}else if (condition2) {
//	//조건 2가 true일 때
//}else if (condition3) {
//	//조건 3이 true일 때
//}

public class IfEx1 {

	public static void main(String[] args) {

		int num = 0;
		// num 값이 0이라면 num=0 출력하기

		if (num == 0) {
			System.out.println("num=0");
		}
		if (num != 0) {
			System.out.println("num!=0");
		}

		// score 60점 이상이면 합격 메세지 출력
		int score = 88;

		if (score >= 60) {
			System.out.println("합격");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int scoreInput = Integer.parseInt(sc.nextLine());

		if (scoreInput >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		int point = 45;
		char grade = ' '; // 블랭크 주는 이유는, 밑의 범주에 포함되지 않는 grade의 경우도 생기기때문. 뭐라도 값을 주기 위해서
		if (point >= 90) {
			grade = 'A';
		} else if (point >= 80) {
			grade = 'B';
		} else if (point >= 70) {
			grade = 'C';
		} else if (point >= 60) {
			grade = 'D';
		} else if (point >= 50) {
			grade = 'E';
		}
		System.out.printf("점수 : %d, 등급 : %c\n", point, grade);
		sc.close();
	}

}
