package ch5;

public class ArrayEx9 {
	public static void main(String[] args) {
		int score[][] = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 }, 
				};
		System.out.println("번호    국어    영어    수학    총점    평균    ");
		System.out.println("=======================================");

		int korTotal = 0, engTotal = 0, mathTotal = 0;

		for (int i = 0; i < score.length; i++) {
			int sum = 0; // 개인별 총점
			System.out.printf("%3d", i + 1);
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%7d", score[i][j]);
				sum += score[i][j];
			}
			System.out.printf("%7d%7d", sum, sum/score[i].length);
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.printf("총점%7d%7d%7d", korTotal, engTotal, mathTotal);
	}
}
