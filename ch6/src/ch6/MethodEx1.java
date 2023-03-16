package ch6;

public class MethodEx1 {
//	반환타입 메소드이름(타입 변수명) {
//		메소드 호출 시 수행될 코드
//		반환 있으면 return +해당타입자료 혹은 변수; 필수로 필요하다
//	}
	
	//리턴 예시
	void add2() {
	}
	//위와 아래는 같다
	void add1() {
		return; // 반환값 없으므로 적는게 필수는 아니다
	}
	int add3() {
		//돌아갈 때 int 값 가지고 돌아감
		return 3;
	}
	String add4() {
		//돌아갈 때 String 값 가지고 돌아감
		return "Hello World!";
	}
	double add5() {
		return 5.0;
	}
	float fl() {
		return 5.0f; // 형 변환 없으면 double이 기본형이라서 에러남
	}
	char add6() {
		return 'k';
	}
	int[] add7() {
		return new int[] {1,1,2,3,5,8,13,21,34,55,89};
	}
	
	//매개변수 예시
	void add8(int a, int b) {
		//a와 b에 int 값이 있어야함 ==> 메소드 호출 시 처리
		//매개변수를 이용한 어떤 작업을 주로 함
		System.out.println(a+b); // 이런거
	}
	
	//외부에서 a와 b의 값을 받아서 내부 코드 실행 후 int 값을 리턴하겠다.
	int add9(int a, int b) {
		//a와 b에 int 값이 있어야함 ==> 메소드 호출 시 처리
		//매개변수를 이용한 어떤 작업을 주로 함
		//a+b를 한 후 리턴
		return a+b; // int 타입의 리턴
	}
	
	double add10(int a, double b) {
		return a+b;
	}
	
}
