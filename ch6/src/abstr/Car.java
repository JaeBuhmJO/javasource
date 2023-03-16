package abstr;
//추상 메소드를 가지는 경우 무조건 추상클래스가 되어야 함

public abstract class Car {
	//자손 클래스에서 정의해서 사용해야 하는 메소드
	// 추상 메소드 : 구현부{}가 없어야 한다
	public abstract void drive(); 
	public abstract void stop();
	
	//부모 클래스에서 자손 클래스로 넘겨줌
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		stopCar();
	}
}
