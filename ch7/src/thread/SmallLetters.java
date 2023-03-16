package thread;

public class SmallLetters extends Thread{
	
	@Override
	public void run() {
		//같이 수행할 코드 작성
		for (int i = 97; i < 123; i++) {
			System.out.print((char)i+" ");
		}
	}
	
	
}
