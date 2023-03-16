package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputEx6 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\IU2.mp4");) {

			int data = 0;

			long start = System.currentTimeMillis();

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
//			byte b[] = new byte[100000];
//			while (fis.read(b) != -1) {
//				fos.write(b);
//			}

			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\IU3.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			int data = 0;

			long start = System.currentTimeMillis();

			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
//			byte b[] = new byte[100000];
//			while (fis.read(b) != -1) {
//				fos.write(b);
//			}

			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\IU4.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			int data = 0;

			long start = System.currentTimeMillis();

//		while ((data = bis.read()) != -1) {
//			bos.write(data);
//		}
			byte b[] = new byte[100000];
			while (fis.read(b) != -1) {
				fos.write(b);
			}

			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
