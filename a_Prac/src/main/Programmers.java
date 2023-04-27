package main;

import java.util.Arrays;

public class Programmers {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(24, 24)));
	}
}

class Solution {
	public int[] solution(int brown, int yellow) {
		// yellow가 1 이상이므로 width, length는 각각 최소한 3 이상
		int width = 3;
		int length = 3;

		// 가로는 세로와 같거나 길다.
		for (int i = 3; i < brown / 2; i++) {
			for (int j = 3; j < brown / 2; j++) {
				if (brown == i * 2 + (j - 2) * 2) {
					if (yellow == (i - 2) * (j - 2)) {
						width = i;
						length = j;
						break;
					}
				}
			}
		}
		int[] answer = { width, length };

		return answer;
	}
}