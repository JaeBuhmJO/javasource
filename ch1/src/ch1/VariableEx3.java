package ch1;

public class VariableEx3 {

	public static void main(String[] args) {

		// 변수의 기본 타입
		// 문자 : char('가')(2byte), String("가")
		// 숫자 : 정수 - byte(1byte), short(2byte), int(4byte), long(4byte)
		// 실수 : float(4byte), double(8byte)
		// 논리 : true/false

		// 두 변수의 값 교환
		int x = 10, y = 20;

		// 비어 있는 공간 작성
		int temp;

		// 둘 중의 하나의 값 임시 이전
		temp = x;

		// 나머지 값 옮기기
		x = y;
		y = temp;
		
		// 출력
		System.out.println("x = " + x + ", y = " + y); // "" + variable : 앞의 문자열과 나열해서 print
		System.out.print("x = " + x);
		System.out.print(", y = " + y);
	
		/* 변수명 규칙
		 * 대소문자 구분, 길이에 제한은 없음
		 * 예약어 사용 불가 ex) int double; double false = 0.12; ...
		 * 숫자로 시작하면 안됨 ex) int 8d = 8;
		 * 특수문자는 _ $ 만 허용 ex) int #8 = 8;
		 * 
		 * 변수의 첫글자는 항상 소문자
		 * 여러 단어로 이루어진 이름은 단어 첫글자를 대문자로 [lastIndexOf]
		 */
		
	}

}
