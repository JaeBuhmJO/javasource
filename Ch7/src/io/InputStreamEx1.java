package io;

import java.io.InputStream;

/* I/O
 * Input/Output
 * Input : 키보드
 * Output : 화면
 * 
 * 스트림(Stream) : 한쪽에서 다른 쪽으로 데이터를 전달하기 위해,
 * 				  두 대상을 연결하고 데이터를 전송할 수 있는 것
 * 
 * 	1) 바이트 기반 스트림 : 바이트 단위로 데이터를 전송
 * 						FileInputStream, FileOutputStream
 *  2) 문자 기반 스트림 : 문자 단위로 데이터를 전송
 *  					FileReader, FileWriter, ...
 */

public class InputStreamEx1 {

	public static void main(String[] args) {
		// Input : Keyboard
//		InputStream in = System.in;
//
//		// 입력이 들어오면 읽어오기
//		try {
//			int input = 0;
//			// read : 한 바이트만 읽어온 뒤 종료
//			while ((input = in.read()) != -1) {
//				// 한글은 3바이트 -> char로 다시 형변환 안됨 -> 깨짐
//				System.out.println((char) input);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		/*
		 * try-with-resource Closable을 구현한 클래스여야 함
		 */
		try (InputStream in = System.in) { // ()객체가 알아서 닫힘
			int input = 0;
			while ((input = in.read()) != -1) {
				System.out.println((char) input);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
