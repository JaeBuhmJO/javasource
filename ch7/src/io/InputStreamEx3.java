package io;

import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx3 {

	public static void main(String[] args) {
//		InputStream in = System.in;
//
//		try {
//			byte[] b = new byte[100];
//			
//			System.out.print("이름 : ");
//			//읽어온 바이트 수 - 실제로 들어있는 바이트 수
//			int nameByte = in.read(b);
//			//String 생성자를 이용해서 nameByte를 String으로 생성하기
//			//enter : carriage return + line feed -> 두 바이트로 구성
//			String name = new String(b,0,nameByte-2);
//			
//			System.out.print("하고 싶은 말 : ");
//			//읽어온 바이트 수 - 실제로 들어있는 바이트 수
//			int commentByte = in.read(b);
//			//String 생성자를 이용해서 commentByte를 String으로 생성하기
//			String comment = new String(b,0,commentByte-2);
//			
//			// 생성한 String 출력
//			System.out.println("입력한 이름 : "+name);
//			System.out.println("입력한 하고 싶은 말 : "+comment);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			// 스트림 닫기
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		try (InputStream in = System.in;){
			byte[] b = new byte[100];
			
			System.out.print("이름 : ");
			int nameByte = in.read(b);
			String name = new String(b,0,nameByte-2);
			
			System.out.print("하고 싶은 말 : ");
			int commentByte = in.read(b);
			String comment = new String(b,0,commentByte-2);
			
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
