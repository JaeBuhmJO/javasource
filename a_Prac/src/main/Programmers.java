package main;

import java.util.Arrays;

public class Programmers {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();

		int section[] = { 2, 3, 6 };
		System.out.println(solution.solution(8, 4, section));
	}
}

class Solution1 {
	public int solution(int n, int m, int[] section) {
		boolean wall[] = new boolean[n];
		Arrays.fill(wall, true);

		for (int i = 0; i < section.length; i++) {
			wall[section[i] - 1] = false;
		}

		// 붓칠할 첫 영역 찾기
		// m길이만큼 true로 전환하기
		int count = 0;
		boolean run = true;
		while (run) {
			int emptywall = 0;
			int lastPainted = 0;

			for (int i = lastPainted + 1; i < wall.length; i++) {
				if (wall[i] == false) {
					emptywall = i;
					break;
				}
			}

			for (int i = emptywall; i < emptywall + m; i++) {
				count++;
				wall[i] = true;
				lastPainted = emptywall + m;
				if (wall[i] == wall[n - 1]) {
					run = false;
					break;
				}
			}
		}

		int answer = count;
		return answer;
	}
}