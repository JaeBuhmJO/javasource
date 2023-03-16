package ch1;

public class VariableEx8 {

	public static void main(String[] args) {

		/*
		 * 형 변환 : 강제형변환(casting) / 자동형변환(작은 형 -> 큰 형) 정수형 -> 실수형 or 실수형 -> 정수형
		 * 			boolean을 제외한 나머지 7개의 기본형은 서로 형변환 가능 
		 * 자동형변환 byte 1-> short,char 2-> int 4-> long 4-> float 4-> double 8
		 */

		// int, float 각각 4byte 지만 float가 조금 더 큰 형, 저장 가능. 반대로는 안됨.
		int i = 91234567;
		float f = i;
		int i2 = (int) f; // casting : int i2 = f; 는 오류나므로 변경 타입을 앞에 꼭 써줘야함
		System.out.printf("i=%d\n", i); // 91234567
		System.out.printf("f=%f\n", f);
		System.out.printf("i2=%d\n", i2); // 91234568 -> 값이 일치하지 않는다, casting 시 데이터 손실 발생 가능성
		
		byte byteValue = 10;
		int intVal = byteValue; // 자동 형변환 - 변경 타입 생략 가능
		System.out.printf("intVal = %d\n",intVal);

		char charVal = 'a';
		int intVal1 = charVal;
		System.out.printf("intVal = %d\n",intVal1);
		System.out.printf("charVal = %c\n",charVal);
		
		
		int intVal3 = 97; char charVal1 = (char)intVal3;
		System.out.printf("intVal3 = %d\n",intVal3);
		System.out.printf("charVal1 = %c\n",charVal1);
		 
		
		double d = 5.5;
		double result = intVal + d; // int랑 double 연산하면 결과형은 무조건 double
		System.out.printf("result = %f\n",result);
		
		// escape 문자 \n : 엔터, \t : 탭 \를 문자열로 쓸거라면 두 번 입력해야
		System.out.println("abc\tdef"); 
		System.out.println("abc\\def"); 
		System.out.println("c:\\");
		
	}
}
