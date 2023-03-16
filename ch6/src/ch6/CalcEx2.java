package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		
		System.out.print(""); //sys print 시리즈 다 메소드다 - 입력형 엄청 많음 
		
		int a =calc.add(5, 3);
		System.out.println(a);
		a  = (int)calc.add(5, 3f);
		System.out.println(a);
		a = (int)calc.add(5, 3l);
		System.out.println(a);
		a= (int)calc.add(5l, 3);
		System.out.println(a);
		
		int arr[] = new int[] {100,200,300,400};
		
		calc.add(arr);

	}

}
