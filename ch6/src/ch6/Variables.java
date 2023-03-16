package ch6;

public class Variables {
	// 선언위치에 따른 변수의 종류
	// 선언 위치에 따라서 변수 생성 시기가 다르다
	
	// 멤버변수(인스턴스 변수) :  인스턴스가 생성되었을 때
	int num;
	
	// 클래스 변수(static 변수, 공유변수) : 클래스가 메모리에 올라갔을 때
	static int cv;

	// 지역 변수 (name, lv 둘 다) : 변수 선언문이 수행되었을 때
	void method(String name) {
		int lv = 0;
	}

}
