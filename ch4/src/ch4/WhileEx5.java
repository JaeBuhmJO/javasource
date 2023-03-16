package ch4;

import java.util.Scanner;

public class WhileEx5 {
	public static void main(String[] args) {

		int balance = 0; // 잔액 변수

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료 ");
			System.out.println("-----------------------------------");
			System.out.print("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.print("예금하실 금액을 입력해주세요 : ");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("출금하실 금액을 입력해주세요 : ");
				int withdraw = Integer.parseInt(sc.nextLine());
				if (balance >= withdraw) {
					balance -= withdraw;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case 3:
				System.out.println("예금 후 현재 잔액은 " + balance + "원 입니다.");
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		}
		sc.close();

	}
}