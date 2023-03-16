package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount creditLineAccount = new CreditLineAccount("110-22",
																	"홍길동", 100000, 5000000);
		
		//금액이 큰 경우
		creditLineAccount.withdraw(6000000); 
		System.out.println(creditLineAccount.getBalance());

		//금액이 작은 경우
		creditLineAccount.withdraw(1000000);
		System.out.println(creditLineAccount.getBalance());

	}

}
