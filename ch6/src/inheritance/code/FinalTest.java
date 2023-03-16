package inheritance.code;

/*final = 무조건 못 바꿈
 * 
 */

public final class FinalTest{ // 클래스에 final => 상속 금지
	final int MAX_SIZE = 10; // 멤버변수에 final = 상수 - 초기화 이후 값 변경 불가능
	//FinalTest 객체마다 별개로 존재
	
	static final int MIN_SIZE = 0;
	//클래스/객체 상관없이 공통 상수
	
	final void getMaxSize() { // 메소드에 final = > 오버라이딩 금지
		final int LV = MAX_SIZE; // 지역변수에 final = 상수
	}


}
