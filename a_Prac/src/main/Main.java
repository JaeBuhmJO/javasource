package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int recCount = 0;

	public static void main(String args[]) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			bw.write(fibRec(n) + " " + fibDyn(n));
		}
	}

	public static int fibRec(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		recCount += 1;
		return fibRec(n - 1) + fibRec(n - 2);
	}

	public static int fibDyn(int n) {
		int dynCount = 0;
		int[] f = new int[n + 1];
		f[1] = 1;
		f[2] = 2;
		for (int i = 3; i < f.length; i++) {
			dynCount += 1;
			f[i] = f[i - 1] + f[i - 2];
		}
		return dynCount;
	}
}