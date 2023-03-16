package inheritance.code;

public class StaticTestEx {
	public static void main(String[] args) {
		//static 변수/메소드 등 호출 : 어디서 호출하든 class명.변수/메소드명
		
		StaticTest.max(10, 5);
		StaticTest.width = 300;
		StaticTest.height = 150;
		System.out.println(StaticTest.width);
		
	}

}
