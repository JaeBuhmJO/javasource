package interf;

/* 인터페이스
 * 추상화 클래스
 * 추상 클래스보다 추상화 정도가 높음 ==> 비 추상 메서드, 멤버변수 가질 수 없음
 * 기본 설계도
 */

public interface Account {
//	int x, y;
	//The blank final field x may not have been initialized
	public static int x = 0;
//	근데 final을 지워도 에러가 없는데?
//	==> 모든 멤버변수는 무조건 public static final(공통 상수)이다. 생략은 가능
	
	void stop();
	//모든 메서드는 public abstract임 (생략 가능) : 구변부{} 작성 불가
	
	//단, static 메서드와 default 메서드는 사용이 가능 (JDK 8버전에서 가능해짐)
	static void print() {}
	default void add() {}
	
	
	
}
