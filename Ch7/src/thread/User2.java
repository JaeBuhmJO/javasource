package thread;

public class User2 extends Thread{
	private Calculator cal; // 포함 관계
	
	public User2(Calculator cal) {
		super();
		this.cal = cal;
		setName("User2");
	}

	@Override
	public void run() {
		cal.setMemory(50);
	}
}
