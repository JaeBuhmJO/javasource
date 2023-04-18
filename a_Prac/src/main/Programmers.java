package main;

import java.util.HashMap;

public class Programmers {
	public static void main(String[] args) {
		Solution solution = new Solution();

		String X = "100";
		String Y = "2345";

		System.out.println(solution.solution(X, Y));
	}
}

class Solution {
	public String solution(String X, String Y) {
		HashMap<Character, Integer> mapX = new HashMap<>();
		HashMap<Character, Integer> mapY = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			mapX.put(Character.forDigit(i, 10), 0);
			mapY.put(Character.forDigit(i, 10), 0);
		}

		for (int i = 0; i < X.length(); i++) {
			mapX.put(X.charAt(i), mapX.get(X.charAt(i)) + 1);
		}
		for (int i = 0; i < Y.length(); i++) {
			mapY.put(Y.charAt(i), mapY.get(Y.charAt(i)) + 1);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 9; i > 0; i--) {
			for (int j = 0; j < Math.min(mapX.get(Character.forDigit(i, 10)),
					mapY.get(Character.forDigit(i, 10))); j++) {
				sb.append(Character.forDigit(i, 10));
			}
		}
		boolean isZero = false;
		if (sb.length() == 0) {
			isZero = true;
		}

		for (int j = 0; j < Math.min(mapX.get(Character.forDigit(0, 10)), mapY.get(Character.forDigit(0, 10))); j++) {
			sb.append(Character.forDigit(0, 10));
		}

		if (sb.length() == 0) {
			return "-1";
		} else if (isZero) {
			return "0";
		}

		return sb.toString();
	}
}