package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOutputEx1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
				BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output3.txt"))) {

			String input;
			System.out.print("파일에 입력할 내용을 입력해주세요\n"+">> ");
			while (!(input=scanner.nextLine()).equals("q")){
				bw.write(input);
				bw.newLine();
			} 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
