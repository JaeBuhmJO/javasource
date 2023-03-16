package ch5;

public class ArrayEx3 {
	public static void main(String[] args) {

		// [] : 1차원 배열
		// [][] : 2차원 배열 (행,열)

		// 1차원 배열은 [] 의 위치가 달라져도 상관은 없다
		int score[] = { 100, 88, 100, 100, 90 };

		// 배열 총합과 평균
		int sum = 0;
		float average = 0f;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		// 478/5 = 95 =>float 변수에 담아봤자 95.0
		// 478/5.0 => 95.6
		average = sum/(float)score.length;
		System.out.printf("총합은 %d, 평균은 %.1f 입니다",sum,average);

	}

}
