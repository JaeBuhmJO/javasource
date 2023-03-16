package exam;

import java.util.Scanner;

public abstract class Converter {
	private double ratio = 1200;
	String SrcString = "원";
	String destString = "달러";

	public abstract double convert(double src); // src/1200
	public abstract String getSrcString(); // "원"
	public abstract String getdestString(); // "달러"
	
	public double getRatio() {
		return ratio;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+" 을(를) "+getdestString() + "로 바꿉니다.");
		System.out.println(getSrcString()+" 을(를) 입력하세요.");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : " + res + getdestString() + " 입니다.");
		scanner.close();
	}
}
