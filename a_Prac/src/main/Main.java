package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int n = Integer.parseInt(br.readLine());
			int numarr[] = new int[n];
			for (int i = 0; i < n; i++) {
				int num = Integer.parseInt(br.readLine());
				numarr[i] = num;
			}
			Arrays.sort(numarr);

			for (int i : numarr) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
