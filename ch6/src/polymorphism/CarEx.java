package polymorphism;

public class CarEx {

	public static void main(String[] args) {
//		FireEngine fireEngine = new Car(); Type
//		Ambulance ambulance = new Car(); mismatch
		Car car1 = new FireEngine();
		Car car2 = new Ambulance();
//		car1. Car 의 멤버, 메소드밖에
//		car2. 접근이 안된다
		
		Car car = null;
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		
		// Car car = new FireEngine();
		car = fireEngine;
		
		fireEngine2 = (FireEngine) car; // 강제 형변환
		// 다형성에 의해서 생성된 객체를 활용해 강제 형변환이 가능하다
		
		fireEngine2.water(); // 

		//자손 왼쪽 부모 오른쪽은 캐스팅 해도 런타임 에러. 그냥 무조건 안됨
//		FireEngine fe = (FireEngine) new Car();
//		fe.drive();
		
//		클래스 끼리는 형제 관계 없음, 같은 클래스를 상속해도 그냥 무관한 클래스
//		FireEngine fe = new Ambulance();
		
	}

}
