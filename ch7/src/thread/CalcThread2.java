package thread;

public class CalcThread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int j = 0; j < 10000000; j++); 
		}
	}
}