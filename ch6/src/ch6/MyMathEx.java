package ch6;

public class MyMathEx {

	public static void main(String[] args) {
		
		Math.random(); // 참조타입 클래스의 스태틱 메소드
		
		long a = MyMath.add(3245l, 2345l);
		long b = MyMath.subtract(3245l, 2345l);
		long c = MyMath.multiply(3245l, 2345l);
		double d = MyMath.divide(3245, 2345);
		System.out.printf("%dl %dl %dl %f\n",a,b,c,d);

		//인스턴스 메소드 호출
		MyMath math = new MyMath();
		math.a = 200l;
		math.b = 100l;
		long a1 = math.add();
		long b1 = math.subtract();
		long c1 = math.multiply();
		double d1 = math.divide();
		System.out.printf("%dl %dl %dl %f\n",a1,b1,c1,d1);
		
	}

}
