package ch6;

public class Numbers {
	int Num[];

	public Numbers(int[] num) {
		super();
		this.Num = num;
	}

	// 배열 총합
	int getTotal() {
		int sum = 0;
		for (int i = 0; i < Num.length; i++) {
			sum += Num[i];
		}
		return sum;
	}

	// 배열 평균
	int getAverage() {
		return getTotal()/Num.length; 
		// 내부에서 호출한거라 클래스명 안붙임
	}

}
