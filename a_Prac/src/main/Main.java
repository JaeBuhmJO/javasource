package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String math = br.readLine();
			StringTokenizer st = new StringTokenizer(math);
			int answer = 0;
			
			boolean isNumber = true;
			while(st.hasMoreTokens()) {
				
				
				isNumber=!isNumber ;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}