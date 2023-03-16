package abstr;

public class CarEx {
	public static void main(String[] args) {
		//다형성
		//Car로 접근할 수 있는 범위 : 부모가 가지고 있는 멤버변수, 메소드
		//단, 오버라이드 된 메소드가 있다면 오버라이드된 메소드로 실행
		Car car = new AICar();
		car.run();
		
		System.out.println("============================");
		car = new ManuCar();
		car.run();
		
		
		
	}
}
