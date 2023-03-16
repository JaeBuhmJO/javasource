package abstr;
//추상클래스를 상속받는 자손 클래스는 무조건 *모든* 추상 메소드를 구현해야 함

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행 중입니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}


}
