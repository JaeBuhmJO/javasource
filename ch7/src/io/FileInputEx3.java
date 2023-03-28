package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileInputEx3 {

	public static void main(String[] args) {
		// FileInputEx1.java를 읽어서 화면에 출력
		// 화면 출력할 때 앞에 행 번호가 나오게끔
		// FileReader, Writer

//		try (FileReader fr = new FileReader(".\\src\\io\\FileInputEx1.java");
//				PrintStream out = System.out) {
//			int data = 0;
//			int row = 1;
//			out.print(row++ + "\t");
//			while ((data = fr.read()) != -1) {
//				out.print((char) data);
//				if ((char) data == '\n') {
//					out.print(row++ + "\t");
//					// 이 아웃이 system.out을 끌고오는거
//				}
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// FileReader / bufferedreader
		try (FileReader fr = new FileReader(".\\src\\io\\FileInputEx1.java");
				BufferedReader br = new BufferedReader(fr)) {
			String str = null;
			int row = 1;
			printline(row++);
			while ((str = (br.readLine())) != null) {
				System.out.println(str);
				printline(row++);
				// 이 아웃이 system.out을 끌고오는거
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

//		try (FileReader fr = new FileReader(".\\src\\io\\FileInputEx1.java");
//				Writer writer = new OutputStreamWriter(System.out)) {
//			int data = 0;
//			int row = 1;
//			System.out.print(row++ + "\t");
//			while ((data = fr.read()) != -1) {
//				System.out.print((char) data);
//				if ((char) data == '\n') {
//					System.out.print(row++ + "\t");
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try (FileReader fr = new FileReader(".\\src\\io\\FileInputEx1.java"); 
//				Writer writer = new OutputStreamWriter(System.out);) {
//			int data = 0;
//			int row =1;
//			System.out.print(row+++"\t");
//			while((data = fr.read())!=-1) {
//				if((char)data=='\n') {
//					System.out.print((char) data);
//					System.out.print(row+++"\t");
//				}else {
//				System.out.print((char)data);
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

	public static void printline(int row) {
		System.out.print(row++ + "\t");
	}

}
