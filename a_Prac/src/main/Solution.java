package main;

public class Solution {
	public static void main(String[] args) {

		Solution solution = new Solution();
		String[] cards1 = { "i", "drink", "water" };
		String[] cards2 = { "want", "to" };
		String[] goal = { "i", "want", "to", "drink", "water" };
		System.out.println(solution.solution(cards1, cards2, goal));
	}

	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";
		int j = 0;
		int k = 0;
		for (int i = 0; i < goal.length; i++) {
			if (j < cards1.length && goal[i].equals(cards1[j])) {
				j++;
			} else if (k < cards2.length && goal[i].equals(cards2[k])) {
				k++;
			} else {
				return "No";
			}
		}
		return "Yes";
	}
}
