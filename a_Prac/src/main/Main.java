package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			Set<String> set = new HashSet<>();
			
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			
			for (int i = 0; i < n; i++) {
				String word = br.readLine();
				set.add(word);
			}
			
			int count = 0;
			for (int i = 0; i < m; i++) {
				String word = br.readLine();
				if (set.contains(word)) {
					count++;
				}
			}
			bw.write(Integer.toString(count));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
