package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 */

public class OutputStreamEx1 {

	public static void main(String[] args) {
		InputStream in = System.in;
		
		//Output : 화면
		OutputStream out = System.out;

		try {
			int input = 0;
			while ((input = in.read()) != -1) {
				out.write(input); // in.read()의 순서대로 write 한다
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
