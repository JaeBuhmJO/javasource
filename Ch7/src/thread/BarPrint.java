package thread;

public class BarPrint extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		long end = System.currentTimeMillis();
		
		System.out.println("\n소요시간- : "+(end-ThreadEx4.start)+"ms");
	}
}
