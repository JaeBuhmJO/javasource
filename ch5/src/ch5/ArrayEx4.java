package ch5;

import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		int score[] = { 79, 88, 91, 33, 100, 55, 95 };

		// 최대값과 최소값
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("최대값은 %d, 최소값은 %d 입니다.\n", max, min);

		for (int i = 0; i < score.length; i++) {
			max = Math.max(max, score[i]);
			min = Math.min(min, score[i]);
		}

		System.out.printf("최대값은 %d, 최소값은 %d 입니다.\n", max, min);

		int maxStream = Arrays.stream(score).max().getAsInt();
		int minStream = Arrays.stream(score).min().getAsInt();
		
		System.out.printf("최대값은 %d, 최소값은 %d 입니다.\n", maxStream, minStream);

	}
}
