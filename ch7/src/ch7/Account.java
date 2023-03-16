package ch7;

public class Account {
	//속성
		//계좌번호(110-10-101010), 예금주명, 잔액(정수)
		String accountNo;
		String owner;
		int balance;
		
		//기능 - 예금하다,인출하다
		
		public Account(String accountNo, String owner, int balance) {
			super();
			this.accountNo = accountNo;
			this.owner = owner;
			this.balance = balance;
		}

		//입금 후 잔액 : 현재 잔액 + 예금액
		int deposit(int amount) {
			balance += amount;
			return balance;
		}
		
		int withdraw(int amount) {
			if(amount>balance) {
//				throw new RuntimeException("잔액부족");
				throw new BalanceInsufficientException("잔액부족");
				//Exception 자체를 원하는 대로 만들 수 있다.
				//BIE가 Exception 으로 상속 받았으면 여기서도 예외처리가 필요
			}
			balance -= amount;
			return balance;
		}
}
