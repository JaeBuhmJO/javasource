package ch6;
/*
 * 클래스
 *  1) 멤버변수 : 속성
 *  2) 메소드 : 기능
 *  3) 생성자 : 인스턴스 초기화 담당
 *     1. 매개변수가 없는 생성자(기본생성자)
 *     2. 매개변수가 있는 생성자
 */

public class Car2 {
	//property : 멤버변수
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자(Constructor)
	//생성자의 이름은 클래스의 이름과 동일해야함 - 규칙 - 어기면 바로 에러
	//리턴값이 없음
	//생성자는 여러개 존재 가능(생성자 오버로딩)
	
	//목적 : 인스턴스가 생성될 때 호출됨
	//		인스턴스 초기화 담당(or 인스턴스 생성시 수행될 코드)

	//기본(default) 생성자
	public Car2() {
		super();
	}
	
	//매개변수가 있는 생성자
	//우클릭 - [source] - [Generate Constructor using fields...]
	public Car2(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; // this -> 생성될 Car2의 
		// ==> this.maxSpeed -> 생성될 car2의 maxSpeed
	}
	

	//function : 메소드
	//전진한다, 후진한다
	void forward() {
		System.out.println("전진한다");
	}
	

	void backward() {
		System.out.println("후진한다");
	}
	
}
