package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		// 자바에서 파일 다루기
		
		//File(String pathname)
		File file1 = new File("c:\\temp\\test1.txt");
		//File(String parent, String child)
		File file2 = new File("c:\\temp","test1.txt");

		//File(file parent, String child)
		File dir = new File("c:\\temp");
		File file3 = new File(dir, "test1.txt");
		
		//file(URL url)
		
		//주요 메소드
		//getName() : 파일명 가져오기 (경로 제외)
		String fileName = file1.getName();
		System.out.println(fileName);
		String fileNameOnly = fileName.substring(0, fileName.lastIndexOf('.'));
		System.out.println(fileNameOnly);
		System.out.println(fileName.substring(fileName.lastIndexOf('.')+1));
		
		//getpath() : 파일명, 확장자 포함 경로 가져오기
		String filePath = file1.getPath();
		System.out.println(filePath);
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath()); // throws Exception

		//getParent() : 파일 속한 dir까지의 경로 가져오기
		System.out.println(file1.getParent());
		
		// pathSeparator : 운영체제에서 사용하는 경로 구분자 알려주기(윈; 유닉스:)
		System.out.println("File.pathSeparator " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar "+File.pathSeparatorChar);
		// Separator : 운영체제에서 사용하는 이름 구분자 알려주기(윈\ 유닉스/)
		System.out.println("File.separator " + File.separator);
		System.out.println("File.separatorChar " + File.separatorChar);
		
	}

}

