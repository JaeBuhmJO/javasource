package ch6;

public class CarEx1 {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car1 = new Car();
		
		// 초기화
		// but 객체지향 언어에서 지양하는 행동. 생성자로 부여하거나, 메소드 활용을 하는 것이 권장됨.
		car1.company = "Hyundai";
		car1.model = "Avante";
		car1.color = "Black";
		car1.maxSpeed = 200;
		
		// 클래스 내부 멤버변수나 메소드 접근 시 클래스명.접근자명
		car1.forward(); // 메소드 호출
		car1.backward();
		
		System.out.println("제조사 "+car1.company);
		System.out.println("모델명 "+car1.model);
		System.out.println("색상 "+car1.color);
		System.out.println("최고시속 "+car1.maxSpeed);
	}

}
