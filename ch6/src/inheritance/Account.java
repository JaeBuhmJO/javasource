package inheritance;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano; // 계좌번호
		this.owner = owner; // 예금주
		this.balance = balance; // 잔액
	}
	
	// 단순 주석 아니고, 오버라이드 된거라고 시스템에 확실히 알림
	//오버라이드는 메서드 이름과 매개변수를 동일하게 가져가야하는데,
	//어노테이션 없이 다르면 그냥 돌아버린다.
	//어노테이션이 있고 다르면 컴파일 에러를 출력, 다르다는 사실을 알게된다.
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	
	//예금하다
	public void deposit(int amount) {
		balance+=amount;
	}
	
	//출금하다
	public int withdraw(int amount) {
		if (balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("잔액이 부족합니다");
		}
		return balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
