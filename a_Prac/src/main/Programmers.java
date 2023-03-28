package main;

import java.util.Arrays;

public class Programmers {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();

		int[] numbers = { 9, 1, 5, 3, 6, 2 };

		System.out.println(Arrays.toString(solution.solution(numbers)));
	}
}

class Solution1 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];

		for (int i = 0; i < answer.length; i++) {
			boolean isBack = false;
			for (int j = i + 1; j < answer.length; j++) {
				if (numbers[i] < numbers[j]) {
					int bln = numbers[j];
					answer[i] = bln;
					isBack = true;
					for (int j2 = i + 2; j2 < j; j2++) {
						if (answer[i] > numbers[j2]) {
							answer[++i] = bln;
						}
					}
				}
			}
			if (isBack == false) {
				answer[i] = -1;
			}
		}

		return answer;
	}
}