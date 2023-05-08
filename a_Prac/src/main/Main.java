package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int steps = Integer.parseInt(br.readLine());
			int[][] dp = new int[steps + 1][2];
			int step1 = Integer.parseInt(br.readLine());
			dp[1][0] = step1;
			dp[1][1] = step1;
			for (int i = 2; i <= steps; i++) {
						
			}

		}
	}
}
