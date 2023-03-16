package inheritance;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		CheckingTrafficCardAccount checkingTrafficCardAccount = new CheckingTrafficCardAccount("110-22", "성춘향", 100000, "3333-4444", false);
		CheckingTrafficCardAccount checkingTrafficCardAccount2 = new CheckingTrafficCardAccount("110-22", "성춘향", 100000, "5555-4444", true);
		
		//교통카드 기능이 없을 때
		checkingTrafficCardAccount.payTrafficCard("3333-4444", 1250);

		//교통카드 기능이 없을 때 + 카드 번호 다를 때
		checkingTrafficCardAccount.payTrafficCard("3333-444", 1250);
		
		//교통카드 기능이 없을 때 + 잔액이 부족할 때
		checkingTrafficCardAccount.payTrafficCard("3333-4444", 125000);

		//교통카드 기능이 있을 때
		System.out.println(checkingTrafficCardAccount2.payTrafficCard("5555-4444", 1250));
		
		//교통카드 기능이 있을 때 + 카드 번호 다를 때
		checkingTrafficCardAccount2.payTrafficCard("5555-444", 1250);
		
		//교통카드 기능이 있을 때 + 잔액이 부족할 때
		checkingTrafficCardAccount2.payTrafficCard("5555-4444", 125000);
		
		
		
	}

}
