package ch4;
/*do-while 
 * while 문 변형으로 조건식과 블럭의 순서를 바꿔놓은 것
 * 조건식이 만족하지 않아도 블럭이 한 번은 수행됨
 * 예를 들어 유효한 범위 내의 숫자를 입력 받아야 하는 경우 등
 * 최초 실행이 한 번은 필요한 경우 이걸로. for 나 while 은 이게 어려움
 */

public class DoWhileEx1 {
	public static void main(String[] args) {
		int input=0;
		
		do {
			System.out.println("hello");
		} while (input!=0);
	
	}
}