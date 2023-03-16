package ch1;

public class VariableEx4 {

	public static void main(String[] args) {

		// 리터럴 : 대입되는 값(상수)

		// 접미사 : L, f, D
		long big = 100_000_000_000L;
		float f = 0.14654f;
		double d = 0.123456789d; // 실수는 더블이 기본형이라서 d는 필수는 아님
		
		f = big;
		d = f;
		System.out.println(d);
		
		// 접두사 : 0(8진수), 0x(16진수), 0b(2진수) -> 출력은 10진수로
		int octNum = 010;
		int hexNum = 0x1a;
		int binNum = 0b10;
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(binNum);

		// 타입이 달라도 저장범위가 넓은 타입에 좁은 타입은 저장이 허용됨
		// char = 'A' = 2byte
		// int = 4byte
		// 그래서 byte b = 129; 는 129가 2byte 초과기때문에 저장이 허용되지 않음.

		int i = 'A';
		char a = 98;
		int xy = 98;
		System.out.println(i);
		System.out.println(a);
		System.out.println(xy);

		// "" : 문자열
		// String : 참조타입 : 대문자로 시작 cf) 기본타입 : 소문자로 시작
		String name = "hong";

		name = name + " 77"; // 1. name 값 가져오기 2. 문자열 77 을 연결하기 3. 연결한 값을 name에 담기
		System.out.println(name);

		String num = 7 + 7 + "7" + 3 + 2; // String 나오기 전 까지는 연산, 그 뒤로는 전부 String 연결
		// 괄호로 우선순위 주면 ""뒤에도 연산 먼저 가능
		System.out.println(num);

		// printf() : 형식화된 출력, println 이랑 다르게 enter는 없음
		// %d : 10진 정수의 형식 출력
		// %c : 문자
		// %s : 문자열
		// %f : 부동소수점 실수

		int age = 25;
		System.out.println("age=입니다." + age);
		System.out.printf("age=%10d입니다.\n", age); // %d로 자리 잡아둔 자리에 age 값을, 10칸 띄어서 출력해줘 (마이너스도 가능)

		char ch1 = 'a';
		String str1 = "abcd";
		double d1 = 3.141592;

		System.out.printf("ch1=%c\n", ch1); // \n 써서 엔터를 따로 줘야함
		System.out.printf("str1=%s\n", str1);
		System.out.printf("%-10s\n", str1);
		System.out.printf("%10s\n", str1);
		System.out.printf("d1=%10.3f\n", d1); // .3 : 소수점 셋째 자리까지

	}

}
