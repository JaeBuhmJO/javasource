package thread;

public class ThreadEx4 {

static long start = 0 ;	
	public static void main(String[] args) {
		
		BarPrint barPrint = new BarPrint();
		barPrint.start();

		start = System.currentTimeMillis();
	
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("!"));
		}
		long end = System.currentTimeMillis();
		
		System.out.println("\n소요시간! : "+(end-start)+"ms");
	
	}

}
