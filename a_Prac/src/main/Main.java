package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 문제에서 준 조건
		try (Scanner scanner = new Scanner(System.in)) {
			int t = Integer.parseInt(scanner.nextLine());
			String input = scanner.nextLine();
		
		
//		System.out.println(isPalindrome(input)+" "+함수 호출횟수);


		}

	}

	// 문제에서 준 메소드
	public static int recursion(String s, int l, int r) {
		if (l >= r)
			return 1;
		else if (s.charAt(l) != s.charAt(r))
			return 0;
		else
			return recursion(s, l + 1, r - 1);
	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
}
