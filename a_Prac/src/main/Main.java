package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static boolean error = false;

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int houses = Integer.parseInt(st.nextToken());
			int wifi = Integer.parseInt(st.nextToken());
			int[] houseArr = new int[houses];
			
			for (int i = 0; i < houses; i++) {
				houseArr[i]=Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(houseArr);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}