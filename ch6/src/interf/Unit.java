package interf;

public abstract class Unit {
	int x,y;
	
	//자손 클래스에서 기능이 다르다면 추상으로 상속한다
	public abstract void move(int x, int y);
	
	//자손 클래스에서 기능이 완전히 동일하다면 구현 해서 상속한다
	public void stop() {
		System.out.println("정지한다");
	}
	
	

}
