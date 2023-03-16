package inheritance;

public class BonusPointAccount extends Account{
	//은행 + 보너스 포인트
	private int bonusPoint;

	public BonusPointAccount(String ano, String owner, int balance,int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	
	public BonusPointAccount(String ano, String owner, int balance) {
		super(ano, owner, balance);
	}

	//예금 기능 구현
	//+보너스 포인트 = 입금액의 1% 부여
	@Override
	public void deposit(int amount) {
		//예금하다는 super deposit에 이미 구현
		super.deposit(amount);
		bonusPoint+=Math.round(amount/100.0);
	}
	
	
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	
}
