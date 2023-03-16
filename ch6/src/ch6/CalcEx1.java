package ch6;

import java.util.Scanner;

public class CalcEx1 {

	public static void main(String[] args) {
		// 사칙연산
		// 해당 클래스를 사용하고 싶다면 무조건 객체 생성부터 해야함 (like Scanner)
		
		//객체 생성
		Calc calc = new Calc();//new가 heap에 영역 생성
		
		System.out.println(calc); // stack에 주소 하나 저장
		//그 주소는 heap에 있는 new Calc1();으로 생성한 Calc1 형태의 calc 를 가리킴
		//그래서 heap에 있는 클래스의 메소드나 변수 등은 클래스명을 통하지 않고 바로 갈 수는 없다.
		System.out.println(calc.add(3, 5)); // System.out.print(add(3,5)); 불가능
		
		//메소드 호출
		//호출할 때는 메소드 원형에 맞춰서 호출해야함
		//메소드가 void가 아닌 경우 리턴 타입에 대한 준비를 해야 함
		//  1) 출력하기
		System.out.println("10 - 4 = "+calc.subtract(10, 4));
		
		//  2) 변수에 받기
		int num = calc.add(6, 2);
		// 변수에 받은 후 출력 / 변수에 받은 후 다른 연산이나 작업을 추가로 해도 됨
	
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String b= sc.nextLine();
		int c = Integer.parseInt(sc.nextLine());
		
		switch (b) {
		case ("+"):
			System.out.println(calc.add(a, c));
			break;
		case ("-"):
			System.out.println(calc.subtract(a, c));
			break;
		case ("*"):
			System.out.println(calc.multiply(a, c));
			break;
		case ("/"):
			System.out.println(calc.divide(a, c));
			break;
		default:
			System.out.println("잘못된 연산자 입력입니다.");
			break;
		}
		sc.close();

	}

}
