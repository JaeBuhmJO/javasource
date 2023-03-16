package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {

	public static void main(String[] args) {
		// Reader, Writer : 문자 기반
		Reader reader = null;
		Writer writer = null;
		try {
			// 인코딩 : UTF-8
			// ms949 => win 캐릭터셋
//			reader = new FileReader("c:\\temp\\file1.txt", Charset.forName("ms949"));
			reader = new FileReader("c:\\temp\\file1.txt");
			//,true : 기존 파일 두고 덧붙이기
			writer = new FileWriter("c:\\temp\\output1.txt",true);
//			int data = 0;
//			while ((data = reader.read()) != -1) { // read - read a single character
//				writer.write(data);
//			}
			char[] b = new char[100];
			while (reader.read(b)!=-1) { 
				writer.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
