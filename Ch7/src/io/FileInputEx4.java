package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/* 보조 스트림
 * 스트림 기능 보완
 * 
 *  모든 바이트에 대해
 * FileInputStream + BufferedInputStream : 버퍼를 이용해 입력 성능 향상
 * FileOutputStream + BufferedOutputStream : 버퍼를 이용해 출력 성능 향상
 * 
 *  텍스트 전용
 * FileReader + BufferedReader : 버퍼를 이용해 입력 성능 향상
 * FileWriter + BufferedWriter : 버퍼를 이용해 출력 성능 향상
 * 
 */

public class FileInputEx4 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			for (int i = '1'; i <= '9'; i++) {
				bos.write(i); //버퍼에 1~9까지 하나씩 찍어감
				//버퍼는 파일이랑 연결 안돼서, FileOutputStream활용해 txt로 버퍼에 있는 값 전달
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
