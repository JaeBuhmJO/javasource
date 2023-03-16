package ch6;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();

		// 초기화
		data.x = 10;
		System.out.println("main() : x = " + data.x);
		System.out.println();

		// 값만 넘어감
		change(data.x);
		// 스태틱 클래스에서 메소드를 호출하려면 같이 스태틱(클래스) 메소드여야 한다
		System.out.println("After change(data.x)");
		System.out.println("main() : x = " + data.x);
		System.out.println();

		// 주소가 넘어감
		change2(data);
		// 스태틱 클래스에서 메소드를 호출하려면 같이 스태틱(클래스) 메소드여야 한다
		System.out.println("After change(data.x)");
		System.out.println("main() : x = " + data.x);
		System.out.println();
	}

	// 기본형 매개변수 : 값만 받게 됨
	// int x : x가 가지고 있는 값만 받음
	static void change(int x) {
		x = 1000;
		System.out.println("change) : x = " + x);
	}

	// 참조형 매개변수 : 값을 읽고 수정 가능
	// : Data varName - 선언해서 스택에 저장된 Data의 heap 주소값을 받아오는 것
	static void change2(Data d) {
		d.x = 1000;
		System.out.println("change) : x = " + d.x);
	}

	// 호출스택 : 스택 - 입/출구가 같음
	// 1. main 저장 -> data.x=10; 수행
	// 이는 data에 0x100 주소 저장 -> heap의 0x100 주소에 10 값 저장

	// 2. change(int x) 저장 -> x = 1000;
	// 여기는 heap의 0x100주소 저장값 '10'을 숫자로 넘겨받음
	// x=1000해도 heap 주소 저장값 변동 안됨.
	// 이 메소드 벗어나면 0x100에는 여전히 10이 저장되어있음
	// : 지역변수라서 메소드 끝나면 x 데이터 휘발

	// JVM 실행 시 main을 제일 먼저 호출한다.

}
