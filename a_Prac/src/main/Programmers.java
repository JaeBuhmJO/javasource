package main;

import java.util.Arrays;

public class Programmers {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();

		String s = "  try  hello   world   ";

		System.out.println(solution.solution(s));
	}
}

class Solution1 {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		String[] words = s.split("");

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (j % 2 == 0) {
					sb.append(Character.toUpperCase(words[i].charAt(j)));
				} else {
					sb.append(Character.toLowerCase(words[i].charAt(j)));
				}
			}
		}
		String answer = sb.toString();
		return answer;
	}
}