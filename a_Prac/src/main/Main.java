package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int numarr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				numarr[i] = num;
			}
			//시간 초과
			Arrays.sort(numarr);
            
			for (int i : numarr) {
			System.out.println(i);
			}
			
		}

	}

}
