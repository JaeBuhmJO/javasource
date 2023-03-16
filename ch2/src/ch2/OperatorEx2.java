package ch2;

public class OperatorEx2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		// 비교연산자 - 결과값이 boolean의 형태로 나옴
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);

		boolean result = num1 == num2;
		System.out.println(result);

		//유니코드 값이 있어서 char도 비교연산이 가능하다
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println("ch1==ch2 = "+(ch1==ch2));
		System.out.println("ch1>=ch2 = "+(ch1>=ch2));
		System.out.println("ch1<=ch2 = "+(ch1<=ch2));
		System.out.println("ch1!=ch2 = "+(ch1!=ch2));
		
		//정밀도가 double이 더 높음. 소수부분 이진수 처리 조심
		double d1 =0.4;
		float f1=0.4f;
		System.out.println("d1==f1 = "+(d1==f1));
		System.out.println("d1>=f1 = "+(d1>=f1));
		System.out.println("d1<=f1 = "+(d1<=f1));
		System.out.println("d1!=f1 = "+(d1!=f1));
	}

}
