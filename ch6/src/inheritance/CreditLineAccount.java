package inheritance;

public class CreditLineAccount extends Account{
	//은행 + 마이너스 한도 적용
	private int creditline;
	
	
	public CreditLineAccount(String ano, String owner, int balance,int creditLine) {
		super(ano, owner, balance);
		this.creditline = creditLine;
	}
	
	//인출하다
	//잔액 = (잔액+마이너스한도) - 사용액
	@Override
	public int withdraw(int amount) {
		if (getBalance()+creditline<amount) {
			System.out.println("잔액이 부족합니다");
			return 0;
		}
		setBalance(getBalance()-amount);
		return amount;
	}

	
}
