package ch6;

public class Person {
	String name;
	float height;
	float weight;
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
	}
	
	// name 매개변수의 값을 받아서
	//Person이 가지고 있는 name 인스턴스 변수의 값을 변경
	//set을 할 때는 주로 void로 많이 함. 리턴이 필요하면 get
	public void setName(String name) {
		if (!name.equals("")&&name!=null) {
		//name이 공백이 아니고 null 아니면
		this.name = name;
		//공백 이거나 null 이면 기본값을 홍길동
		}else {
			this.name = "홍길동";
		}
	}
	
	static void print2() {
		Person ps = new Person(); // 클래스 안의 변수를 써먹을 때는 무조건 인스턴스화
		ps.setName("");
		ps.print();
	}
	
}
