package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("사용법 : java FileEx2 디렉토리명");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles(); //지정한 경로에 있는 폴더/파일명 배열로 읽어옴
		for (File file : files) {
			System.out.println(file);
		}
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+fileName+"]":fileName);
		}
		
	}

}

