package thread;

import javax.swing.JOptionPane;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadEx6 t6 = new ThreadEx6();
		t6.start(); // 이거 쓰레드 바로 실행하라는 소리는 아님
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
		//두 쓰레드가 서로 다른 자원을 사용하는 작업의 경우에는
		//멀티쓰레드 프로세스가 더 효율적임
		
	}

}
