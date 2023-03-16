package inheritance;

public class CheckingAccount extends Account {

	public String cardNo; // 체크카드 번호

	// 은행계좌 + 체크카드
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance); // super() -> 부모 생성자
		this.cardNo = cardNo;
	}

	// 체크카드 사용액을 지불한다
	// 카드번호, 사용액을 매개변수로 받아서 은행 잔고보다 작거나 같은 경우 사용액을 지불
	// 카드번호 일치하는지 확인

	// 은행 잔고보다 크거나, 카드번호가 일치하지 않으면 지불불가 메시지 출력
	// 메소드 명은 pay(), 잔액값을 리턴
	public int pay(String cardNo, int payAmount) {
		if (super.getBalance() < payAmount || !cardNo.equals(this.cardNo)) {
			System.out.println("카드번호나 잔액을 확인해주세요");
			return 0;
		}
		return withdraw(payAmount);
	}

	public int paySimple(String cardNo, int payAmount) {
		if (cardNo.equals(this.cardNo)) {
			return super.withdraw(payAmount);
		}
		System.out.println("카드번호를 확인해주세요");
		return 0;
	}

}
