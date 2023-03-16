package ch6;

/*자바의 기능 구현 등은 클래스 없이는 안된다. 무조건 클래스를 통해서 구현하게 된다
 * 
 */

public class CarEx2 {

	public static void main(String[] args) {
		// 객체 생성 시 생성자를 자동으로 호출
		Car2 car = new Car2();
		System.out.print(car.company);
		System.out.print(car.model);
		System.out.print(car.color);
		System.out.print(car.maxSpeed);
		System.out.println();
		
		//권장되지 않는 초기화 방법
		car.color="White";
		car.company="Kia";
		car.maxSpeed=190;
		car.model="Sportage";
		System.out.print(car.company);
		System.out.print(car.model);
		System.out.print(car.color);
		System.out.print(car.maxSpeed);
		System.out.println();
		
		//매개변수가 있는 생성자 호출하면서 객체 생성
		//초기화 방식 1. 매개변수가 있는 생성자 활용
		Car2 car2 = new Car2("Kia", "Ray", "White", 150);
		System.out.print(car2.company);
		System.out.print(car2.model);
		System.out.print(car2.color);
		System.out.print(car2.maxSpeed);
		
	}

}
