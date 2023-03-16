package ch1;

public class VariableEx2 {

	public static void main(String[] args) {
		// 변수 : 단 하나의 값만 저장할 수 있는 메모리 공간
		// 메모리에 어떤 값을 저장할 것인가? 에 따라 타입 결정됨

		// 변수의 기본 타입
		// 문자 : char('가')(2byte), String("가")
		// 숫자 : 정수 - byte(1byte)[-128 ~ 127], short(2byte), int(4byte), long(4byte)
		// 실수 - float(4byte), double(8byte)
		// 논리 : true/false

		// 자바 문장의 끝은 세미콜론으로 끝나야 함

		// 변수의 선언 (int a;)과 초기화(a = 10;)
//		int c;
//		c = 20;
		// 타입 변수명 = 값;
		int a = 15, b = 5;

		System.out.println("a+b");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		// 실수
		// 기본으로 인식하는 타입은 double 임
		// float - double 정밀도 차이가 있음
		// float에 담으려면 끝에 f 붙여야함, 리터럴에 붙는 문자는 대소문자 구별 안함
		double d1 = 0.1234567890123456789; // 넘어가는 소수점자리, 정확한 반올림 아님. 이상한 수 나올 수 있음
		float f1 = 0.12345678909f;
		System.out.println("d1 = " + d1);
		System.out.println("f1 = " + f1);

		// 논리값
		boolean b1 = true;
		System.out.println(b1);

		String b2 = "true";
		System.out.println(b2);

		// 문자
		// 빈 문자열도 프로그래밍 언어에서는 문자로 취급
		char blank = ' ';
		char ch1 = 'a';
		System.out.println(blank);
		System.out.println(ch1);
		System.out.println(ch1 + 1); // 97 + 1 = 98. 문자는 인코딩 방식에 따라 정수값 부여받음 ==> 유니코드

	}

}
