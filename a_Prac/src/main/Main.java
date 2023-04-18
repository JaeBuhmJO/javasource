package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());

			boolean[] primes = new boolean[n + 1];
			Arrays.fill(primes, true);
			primes[0] = false;
			primes[1] = false;

			for (int i = 2; i < primes.length; i++) {
				for (int j = i * i; j < primes.length; j += i) {
					primes[j] = false;
				}
			}

			ArrayList<Integer> primeList = new ArrayList<>();

			int num = 0;
			for (boolean isPrime : primes) {
				if (isPrime) {
					primeList.add(num);
				}
				num++;
			}

			int start = 0;
			int end = 0;
			int sum = 0;
			int count = 0;

			while (end < primeList.size()) {
				sum += primeList.get(end++);
				while (sum >= n) {
					if (sum == n) {
						count++;
					}
					sum -= primeList.get(start++);
				}
			}
			bw.write(count + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}