package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread t1 = new BigLetters();
		Thread t2 = new SmallLetters();
		t1.start();
		t2.start();
		
		Runnable runnable = new NumPrint();
		Thread t3 = new Thread(runnable);
		t3.start();
		
		Thread t4 = new Thread(new NumPrint());
		t4.start();
		
	}

}
