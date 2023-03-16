package inheritance.code;

import modifier.Account;
//The type modifier.Account is not visible(public이외의 경우)
//class는 대부분 public으로 설정한다. - 패키지가 다른 경우가 많아서

//컴파일 오류 - 문법이 잘못된 경우 IDE를 사용하면 바로 알려줌
//런타임 오류 - 

public class Modifier1 {
	//String string = new String("Hello"); 
	// => String str = "Hello";
	// 스트링만, 사용빈도 너무 높아 축약 가능
	Account acc = new Account(); // 포함관계 선언
	
	private void print() {
		//Account가 가지고 있는 ano 접근하고싶다면?
		//NullPointerException - 참조타입에서만 발생 가능한 오류
		String ano = acc.getAno();
		System.out.println("ano = "+ano);
		acc.setAno("111-22");
		System.out.println("ano = "+acc.getAno());
	}
		
		/*static 에서 non static 메소드 호출하기
		 * 1. 메소드를 static 으로 변경한다
		 * 2. 인스턴스화 하고 객체를 통해서 접근
		 */
	public static void main(String[] args) {
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();
		
	}
}
