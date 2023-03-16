package lang;

import static java.lang.Math.*;

public class MathEx2 {
	public static void main(String[] args) {
		Math math; // 는 생성자가 없다 - 인스턴스화 불가능
		//인스턴스.메소드() 사용이 불가능 => 모든 메서드, 필드가 static
		//그런 클래스는 위에 import static 치고 . 를 생략할 수 있다
		System.out.println(E);
		System.out.println(PI);
		
		//반올림, 올림, 버림
		double val = 90.7552;
		System.out.println(val);
		System.out.println(round(val));
		System.out.println(round(val*100));
		System.out.println(round(val*100)/100.0);
		System.out.println();
		
		//ceil() : 올림
		System.out.println(ceil(val));
		
		//floor() : 버림
		System.out.println(floor(val));
		
		//max() & min() :
		System.out.println(max(5, 3));
		System.out.println(min(5, 3));
		
		
		
	}

}
