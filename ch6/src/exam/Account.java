package exam;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	@Override // 단순 주석 아니고, 오버라이드 된거라고 시스템에 확실히 알림
	//오버라이드는 메서드 이름과 매개변수를 동일하게 가져가야하는데,
	//어노테이션 없이 다르면 그냥 돌아버린다.
	//어노테이션이 있고 다르면 컴파일 에러를 출력, 다르다는 사실을 알게된다.
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
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
