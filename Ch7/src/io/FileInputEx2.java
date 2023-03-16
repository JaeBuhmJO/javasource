package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputEx2 {

	public static void main(String[] args) {
//		// copy - c:\\temp\\file1.txt -> c:\\temp\\file2.txt로
//
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//
//		try {
//			fis = new FileInputStream("c:\\temp\\iu.mp4");
//			// 대소문자 구분 안된다, 같은 제목으로 해두면 원본 파일 날아감
//			fos = new FileOutputStream("c:\\temp\\IU2.mp4");
////			int data = 0;
////			while ((data = fis.read()) != -1) { //하루 종일 걸림
////				fos.write(data);
////			}
//			byte b[] = new byte[1000]; // 마지막 버퍼 크기는 무조건반영
//			//ex. 1KB파일 복사하는데 10KB버퍼로 복사뜨면 파일이 10KB가 됨
//			while (fis.read(b) != -1) {
//				fos.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\IU2.mp4");) {
//			int data = 0;
//			while ((data = fis.read()) != -1) { //하루 종일 걸림
//				fos.write(data);
//			}
			byte b[] = new byte[1000];
			while (fis.read(b) != -1) {
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
