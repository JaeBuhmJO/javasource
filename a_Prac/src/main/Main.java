package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int numbers = Integer.parseInt(st.nextToken());
			int deno = Integer.parseInt(st.nextToken());

			int[] preSum = new int[numbers + 1];

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= numbers; i++) {
				preSum[i] = preSum[i - 1] + Integer.parseInt(st.nextToken());
			}

			int count = 0;
			for (int i = 1; i <= preSum.length; i++) {
				for (int j = 0; j < preSum.length - i; j++) {
					if ((preSum[i + j] - preSum[j]) % deno == 0) {
						count += 1;
					}
				}
			}
			System.out.println(count);
		}
	}
}
