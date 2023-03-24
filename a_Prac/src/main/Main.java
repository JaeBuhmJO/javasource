package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			
			int count = 0;
			for (int i = 1; i <= Math.sqrt(n); i++) {
				if(i*i<=n) {
					count++;
				}
			}
			bw.write(String.valueOf(count));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}