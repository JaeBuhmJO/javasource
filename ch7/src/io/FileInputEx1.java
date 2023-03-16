package io;

import java.io.FileInputStream;
import java.io.OutputStream;

public class FileInputEx1 {

	public static void main(String[] args) {
		// File에서 내용 읽기
		// text, 음악, 동영상, 이미지...
		// text : Byte 기반, 문자기반(FileReader)
		// 음악, 동영상, 이미지 : Byte 기반(FileInputStream)

//		FileInputStream fis = null;
//		OutputStream out = System.out;
//		try {
//			fis = new FileInputStream(".\\src\\io\\FileEx4.java");
////			int data = 0;
////			while ((data = fis.read()) != -1) {
////				System.out.print((char)data); // 한글은 깨지지만 파일 긁어옴
////			}
//			byte[] b =new byte[100];
//			while (fis.read(b)!=-1) {
//				out.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		try (FileInputStream fis = new FileInputStream(".\\src\\io\\FileEx4.java"); 
				OutputStream out = System.out;) {
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data); // 한글은 깨지지만 파일 긁어옴
			}
			byte[] b = new byte[100];
			while (fis.read(b) != -1) {
				out.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
