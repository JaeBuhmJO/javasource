package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int testcases = Integer.parseInt(br.readLine());
			for (int i = 0; i < testcases; i++) {
				Map<String, Integer> cabinet = new HashMap<>();
				int combinations = 1;
				int set = 0;

				int items = Integer.parseInt(br.readLine());
				for (int j = 0; j < items; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					st.nextToken();
					String part = st.nextToken();
					cabinet.put(part, cabinet.getOrDefault(part, 0) + 1);
				}

				for (Map.Entry<String, Integer> entry : cabinet.entrySet()) {
					Integer val = entry.getValue();
					set += val;
					combinations *= val;
				}

				if (cabinet.size() > 1) {
					set += combinations;
				}
				System.out.println(set);
			}
		}
	}
}
