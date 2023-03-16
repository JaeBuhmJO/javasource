package ch6;

public class NumbersEx {

	public static void main(String[] args) {
		int num[] = new int[] {10,15,25,36,55,95};
		Numbers numbers = new Numbers(num);
		
		System.out.println("총합 "+numbers.getTotal());
		System.out.println("평균 "+numbers.getAverage());
		
	}

}
