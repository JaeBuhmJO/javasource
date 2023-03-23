package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			Map<Integer, String> map = new HashMap<>();
			
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				map.put(Integer.parseInt(st.nextToken()), st.nextToken());
			}
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}