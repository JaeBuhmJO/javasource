package thread;

/* 프로세스 : 실행 중인 프로그램
 * 프로세스 안에는 최소한 하나 이상의 쓰레드가 존재
 *  => 둘 이상의 쓰레드를 가진 프로세스를 멀티 쓰레드 프로세스라 함
 * 
 * 멀티 쓰레드 장점
 *  - cpu 사용률 향상
 *  - 자원을 효율적으로 사용
 *  - 응답성이 향상
 *  - 작업이 분리되어 코드가 간결해짐
 *  
 *  멀티 쓰레딩 필수 고려사항
 *   - 동기화
 *   - 고착상태
 *   
 *  쓰레드 구현 방법
 *  1) Thread 클래스 상속
 *  2) Runnable 인터페이스 구현
 *  
 */

public class ThreadEx1 {

	public static void main(String[] args) {
		
		//멀티쓰레드로 동작할 인스턴스 생성
		SmallLetters t1 = new SmallLetters();
		t1.start();
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i+" ");
		}
		
	}

}
