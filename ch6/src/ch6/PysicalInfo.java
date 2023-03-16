package ch6;

public class PysicalInfo {
	//오버로딩 - 한 클래스에 동일한 이름의 메소드, 생성자가 존재하는 것
	
	//멤버변수 선언
	String name;
	int age;
	float height;
	float weight;
	
	//생성자 오버로딩 규칙
	//생성자 이름은 같아야함
	//매개변수의 개수 또는 '타입'이 달라야 함
	// - 매개변수 이름만 바꾸거나, 같은 타입끼리 자리 바꾼건 안됨
	public PysicalInfo(String name, int age, float height, float weight) {
//		super();
		
//		this.name = name;
//		this.age = age;
		this(name,age); // 생성자에서 다른 생성자를 통으로 호출 - 덧붙이기도 안된다.
		this.height=height;
		this.weight=weight; // 다른 생성자 호출은 생성자 첫 줄에서만 가능하다
	}
	
	public PysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public PysicalInfo(int age, String name, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public PysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
