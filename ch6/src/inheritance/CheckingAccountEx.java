package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("110-11", "홍길동", 100000, "4444-5555");
		
		//카드번호 다를 때
		checkingAccount.pay("5555-4444", 10000);
		checkingAccount.paySimple("5555-4444", 10000);
		
		//카드번호 동일하고 잔액 부족할 때
		checkingAccount.pay("4444-5555", 1000000);
		checkingAccount.paySimple("4444-5555", 1000000);
		
		//카드번호 동일하고 잔액 충분할 때
		int balance = checkingAccount.pay("4444-5555", 10000);
		System.out.println("지불 후 잔액 : "+balance);
		balance = checkingAccount.paySimple("4444-5555", 10000);
		System.out.println("지불 후 잔액 : "+balance);
	}

}
