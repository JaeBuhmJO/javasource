package ch6;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account("110-10-101010","홍길동",1000);
		Account account2 = new Account("110-10-101011","성춘향",200000);

		//홍길동 계좌 입/출금 기능 사용 ==> 메소드 호출
		account1.deposit(500000);
		System.out.println(account1.balance);
		account1.withdraw(1000000);
		System.out.println(account1.balance);

		//성춘향 계좌 입/출금
		account2.deposit(800000);
		System.out.println(account2.balance);
		account2.withdraw(500000);
		System.out.println(account2.balance);

	}

}
