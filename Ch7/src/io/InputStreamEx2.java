package io;

import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
//		InputStream in = System.in;
//
//		OutputStream out = System.out;
//
//		try {
//			int input = 0;
//			// read(byte[] b) : byte 배열만큼 읽어옴(더 없으면 -1 리턴)
//			// write(byte[] b) : byte 배열만큼 쓰기
//			byte[] b = new byte[100];
//			while ((in.read(b)) != -1) {
//				out.write(b);
//				System.out.println((char) input);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			// 스트림 닫기
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		try (InputStream in = System.in; OutputStream out = System.out) {
			int input = 0;
			byte[] b = new byte[100];
			while ((input = in.read(b)) != -1) {
				out.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
