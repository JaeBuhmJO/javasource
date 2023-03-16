package ch6;

public class PersonEx {

	public static void main(String[] args) {
		Person ps = new Person(); // Person instance 하나가 생성됨
		// => person이 가지고 있는 인스턴스변수, 메소드를 사용할 수 있다.
		
		ps.setName("");
		ps.print();
		
		Person.print2(); // 스태틱은 변수에 따라붙는게 아니므로 클래스명으로 호출
		
	}
	
}
