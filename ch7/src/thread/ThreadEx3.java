package thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		long end = System.currentTimeMillis();
		
		System.out.println("\n소요시간 : "+(end-start)+"ms");
	
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("!"));
		}
		end = System.currentTimeMillis();
		
		System.out.println("\n소요시간 : "+(end-start)+"ms");
	
	}

}
