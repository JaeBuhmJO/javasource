package thread;

public class BigLetters extends Thread{
	
	@Override
	public void run() {
		//같이 수행할 코드 작성
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i+" ");
		}
	}
	
	
}
