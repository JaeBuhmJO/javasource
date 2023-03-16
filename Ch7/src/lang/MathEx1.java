package lang;

public class MathEx1 {
	public static void main(String[] args) {
		Math math; // Math는 생성자가 없다 - 인스턴스화 불가능
		//인스턴스.메소드() 사용이 불가능 => 모든 메서드, 필드가 static
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		//반올림, 올림, 버림
		double val = 90.7552;
		System.out.println(val);
		System.out.println(Math.round(val));
		System.out.println(Math.round(val*100));
		System.out.println(Math.round(val*100)/100.0);
		System.out.println();
		
		//ceil() : 올림
		System.out.println(Math.ceil(val));
		
		//floor() : 버림
		System.out.println(Math.floor(val));
		
		//max() & min() :
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		
		
	}

}
