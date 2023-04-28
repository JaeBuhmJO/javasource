package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static boolean error = false;

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int houses = Integer.parseInt(br.readLine());
			int[][] dp = new int[houses + 1][3];
			dp[0][0] = 0;
			dp[0][1] = 0;
			dp[0][2] = 0;
			for (int i = 2; i <= houses; i++) {
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}