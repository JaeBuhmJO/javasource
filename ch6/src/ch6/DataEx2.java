package ch6;

public class DataEx2 {

	public static void main(String[] args) {
		// 인스턴스 생성
		// 참조형타입 변수명 = new 참조형타입(); : 배열도 비슷하게 생성-> 참조형
		Data d = new Data();
		System.out.println(d.x);
		d.x = 10;
		System.out.println(d);
		System.out.println(d.x);
		Data d2 = copy(d); // 내부에서 호출한거라 클래스명 안붙였음
		System.out.println(d2);
		System.out.println(d2.x);
	}

	//x 값이 d와 같은 신규 데이터 인스턴스 복제
	static Data copy(Data d) {
		Data temp = new Data();
		temp.x = d.x;
		return temp;
	}

}
