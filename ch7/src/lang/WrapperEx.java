package lang;

/* 타입
 * 기본형 : byte, int, char, long, double, boolean 등등
 * 참조형 : 배열, 클래스, 인터페이스 등등
 * 
 * Wrapper 클래스 - 기본형을 객체화하여 활용 가능
 */

public class WrapperEx {
	public static void main(String[] args) {
		//Wrapper class
		Character ch2 = 'b';
		Byte b2 = 4;
		Float f2 = 4.15f;
		Double d2 = 4.3;
		Boolean bool2 = true;
		Long l2 = 3l;

		//정수형 자료를 다룰 때 - 기본형
		int a = 3;
		int d= 3;
//		System.out.println(a.equals(d)); 이건 컴파일 에러
		//정수형 자료를 다룰 때 - 참조형
		// - 객체화 되어서 클래스, 인터페이스 등의 기능이 제공된다
//		Integer b = new Integer(3); deprecated
		Integer i2 = 3;
		Integer i3 = 3;
		System.out.println(i2.equals(i3));
		// i3 초기화때 메모리상 Integer=3 값을 찾아서 있으면 동일 주소 부여
		System.out.println(i2==i3);
		
		//래퍼 클래스 스태틱 메소드
		System.out.println(Long.parseLong("10"));
		System.out.println(Float.parseFloat("10"));
		System.out.println(Integer.parseInt("10"));
		System.out.println(Double.parseDouble("10"));
		System.out.println(Boolean.parseBoolean("10"));
		
		//박싱
		Integer i4 = a;
		
		//언박싱
		int c = i4;
		
		
	}
}
