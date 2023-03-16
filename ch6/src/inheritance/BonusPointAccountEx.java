package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonusPointAccount = new BonusPointAccount("110-22", "홍길동", 100000);

		bonusPointAccount.deposit(1000000);
		System.out.println("예금액 : " + bonusPointAccount.getBalance());
		System.out.println("현재 보너스 포인트 : "+bonusPointAccount.getBonusPoint());
		
		
	}

}
