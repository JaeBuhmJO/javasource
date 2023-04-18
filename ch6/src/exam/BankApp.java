package exam;

import java.util.Scanner;

public class BankApp {

	// 인스턴스 변수(초기화 완료)
	// main 메소드 밖에 만든 이유 : 다른 메소드에서 사용하기 위해서. 변수 유효범위

	private static Account[] accountArray = new Account[10]; // Account 객체 배열 10개 선언, 생성
	private static Scanner scanner = new Scanner(System.in); // 사용자 입력용
	private static int totalAccountNum = 0;
	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5.종료 | 6.계좌해지");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 >>");

			// sc.nextLine(): 개행문자가 올 때까지 String 타입으로 입력값을 처리
			int selectNo = Integer.parseInt(scanner.nextLine());
			// sc.nextInt() : int타입으로 입력값을 처리하겠음

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			case 6:
				deleteAccount();
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다");
				break;
			}

		} // while 문 종료

	}// main 종료

	private static void createAccount() {
		// 계좌 생성
		// Account 인스턴스를 생성하기 위한 입력받아서 객체 생성, 배열에 저장
		System.out.print("계좌번호를 입력 : ");
		String ano = scanner.nextLine();
		System.out.print("예금주명 입력 : ");
		String owner = scanner.nextLine();
		System.out.print("최초 입금금액 입력 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				totalAccountNum++;
				break;
			}
		}

	}

	private static void accountList() {
		if (isAccount() == false) {
			return;
		}
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}

	}

	private static void deposit() {
		if (isAccount() == false) {
			return;
		}
		System.out.print("입금할 계좌번호를 입력해주세요 : ");
		String ano = scanner.nextLine();
		System.out.print("입금하려는 금액을 입력해주세요 : ");
		int amount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					accountArray[i].setBalance(accountArray[i].getBalance() + amount);
					printBalance(i);
				}
			}
		}
	}

//	private static void depositcomplex() {
//		if (isAccount() == false) {
//			return;
//		}
//		boolean run = true;
//		while (run) {
//			System.out.print("입금할 계좌번호를 입력해주세요 : ");
//			String ano = scanner.nextLine();
//			deposit: for (int i = 0; i < accountArray.length; i++) {
//				if (accountArray[i] != null) {
//					if (ano.equals(accountArray[i].getAno()) == true) {
//						System.out.print("해당계좌에 입금하시겠습니까? 확인 :y 뒤로가기 :x");
//						String confirmAno = scanner.nextLine();
//						switch (confirmAno) {
//						case "y":
//							System.out.print("입금하려는 금액을 입력해주세요 : ");
//							int amount = Integer.parseInt(scanner.nextLine());
//							accountArray[i].setBalance(accountArray[i].getBalance() + amount);
//							printBalance(i);
//							run = false;
//							break;
//						case "x":
//							break deposit;
//						default:
//							System.out.println("잘못된 입력입니다");
//							break;
//						}
//					}
//				}
//			}
//		}
//	}

	private static void withdraw() {
		if (isAccount() == false) {
			return;
		}
		System.out.print("출금할 계좌번호를 입력해주세요 : ");
		String ano = scanner.nextLine();
		System.out.print("출금하려는 금액을 입력해주세요 : ");
		int amount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano) && amount <= accountArray[i].getBalance()) {
					accountArray[i].setBalance(accountArray[i].getBalance() - amount);
					printBalance(i);
				} else {
					System.out.println("잔액이 부족합니다");
				}
			}
		}
	}

	private static void deleteAccount() {
		if (isAccount() == false) {
			return;
		}
		boolean run = true;
		while (run && totalAccountNum > 0) {

			System.out.print("해지할 계좌의 계좌번호 입력 (뒤로가기: x): ");
			String ano = scanner.nextLine();
			if (ano.equals("x")) {
				break;
			}
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] != null) {
					if (ano.equals(accountArray[i].getAno()) == true) {
						accountArray[i] = null;
						totalAccountNum--;
						System.out.printf("%s 계좌가 정상적으로 해지되었습니다\n", ano);
						run = false;
						break;
					}
					System.out.println("잘못된 ano 입니다.");
				}
			}
		}

	}

	private static boolean isAccount() {
		if (totalAccountNum == 0) {
			System.out.println("보유하고 있는 계좌가 없습니다");
		}
		return totalAccountNum != 0;
	}

	private static void printBalance(int i) {
		System.out.printf("%s 계좌의 거래 후 잔액은 %d원 입니다.\n", accountArray[i].getAno(), accountArray[i].getBalance());
	}
}
