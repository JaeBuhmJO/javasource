package lang;

/* java.lang 패키지 안의 클래스 활용 - import구문 없이 사용 가능
 * Object : 모든 클래스의 부모
 * Object 클래스는 멤버변수는 없음
 */

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//equals() = obj1과 obj2가 같은 객체냐
		System.out.println(obj1.equals(obj2)? "같다" : "다르다");
		System.out.println(obj1 == obj2 ? "같음" : "다름");
		
		//Object의 toString 메소드 - 패키지명.클래스명.@hashcode값
		//자손 클래스에서 거의 무조건 오버라이드 한다
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	
		//Value 부모 : Object 클래스
		//부모 메소드 + Value 객체 메소드 사용 가능
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2)? "같다" : "다르다");
		System.out.println(value1 == value2 ? "같음" : "다름");
		System.out.println(value1.toString());
		System.out.println(value2.toString());
		
		Person person1 = new Person(80110581122L);
		Person person2 = new Person(80110581122L);
		System.out.println(person1.equals(person2)?"person1과 person2는 같은 사람": "person1과 person2는 다른 사람");
		//toString 오버라이드 되어있으면 메소드 호출 꼭 안해도 된다
		System.out.println(person1);
		System.out.println(person1.toString());
		
		Card card1 = new Card();
		Card card2 = new Card("HEART",10);
		
		System.out.print(""+card1 + card2);
	}

}
