package ch6;
/* 변수와 메소드에 스태틱이 붙는 경우
 * 같은 스태틱끼리는 문제가 없다
 * 스태틱에 인스턴스를 호출하면 에러
 * 하려면, 인스턴스를 먼저 생성 후에 해야한다.
 */

public class MemberCall {
	//instance variable - 인스턴스화 해야 메모리에 등재
	int iv = 10;
	
	//스태틱 변수
	static int cv = 20;
	
	//인스턴스 변수에 클래스(스태틱)변수 값 대입 연산
	int iv2 = cv;
	
	//클래스(스태틱)변수에 인스턴스 변수 값 대입 연산
//	static int cv2 = iv; 
	//스태틱은 메모리에 올라갈때 형성되어야하는데
	//인스턴스 변수 값을 부여하면 그 시점에 값이 없어서 부여 불가.
	// => 에러
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); 
		// iv라는 변수 자체가 메모리에 안 올라갔기 때문에 에러
		// 인스턴스화 후 해당 클래스 안에서는 사용 가능
//		instanceMethod1();
//		인스턴스 메소드가 인스턴스 변수를 포함 안해도, 그 자체가 인스턴스화 전
//		메모리에 올라가지 않으므로 스태틱 메소드에 호출 불가
	}
	
	void instanceMethod1() {
		staticMethod1();
		System.out.println(cv);
		System.out.println(iv);
		//이건 어차피 메소드 자체가 인스턴스화 후 메모리 올라감
	}

}
