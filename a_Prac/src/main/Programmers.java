package main;

public class Programmers {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String numbers = "0";
	}
}

class Solution {
	static int answer = 0;
	static int targetNum = 0;
	static int[] numberArr;

	public int solution(int[] numbers, int target) {
		targetNum = target;
		numberArr = numbers;
		dfs(numbers[0], 0, numbers[0]);
		dfs(numbers[0], 0, -numbers[0]);

		return answer;
	}

	public void dfs(int visitNode, int idx, int sum) {
		if (idx == numberArr.length - 1) {
			if (sum == targetNum) {
				answer++;
			}
		} else {
			dfs(numberArr[idx + 1], idx + 1, sum + numberArr[idx + 1]);
			dfs(numberArr[idx + 1], idx + 1, sum - numberArr[idx + 1]);
		}
	}
}