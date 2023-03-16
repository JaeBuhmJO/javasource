package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputEx5 {

	public static void main(String[] args) {
		//파일 문자단위로 읽기/쓰기를 수행할건데 버퍼를 활용하겠다
		try (FileReader fr = new FileReader("c:\\temp\\file1.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("c:\\temp\\output3.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			
//			br.readLine(); // 줄 단위 String으로 읽어올 수 있음, 남은 행 없으면 null
			String str = null;
			while ((str = br.readLine())!=null) {
				bw.write(str);
				bw.newLine(); // enter
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
