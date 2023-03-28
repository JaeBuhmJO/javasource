package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());

			String[][] arr = new String[n][2];
			for (int i = 0; i < n; i++) {
				String[] input = br.readLine().split(" ");
				arr[i][0] = input[0];
				arr[i][1] = input[1];
			}
			sort(arr);

			for (String[] string : arr) {
				bw.write(string[0] + " " + string[1]);
				bw.newLine();
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

	public static void sort(String[][] arr) {
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});

	}

	public static int getAge(String string) {
		return Integer.parseInt(string);
	}

}