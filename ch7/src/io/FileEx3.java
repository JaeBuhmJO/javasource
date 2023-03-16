package io;

import java.io.File;

public class FileEx3 {
	//삭제된 파일 개수 저장 변수
	static int deletedFiles = 0;
	public static void main(String[] args) {
		//목적 : .txt 파일 삭제
		if (args.length != 1) {
			System.out.println("사용법 : java FileEx2 디렉토리명");
			System.exit(0);
		}
		
		//현재 작업 디렉토리 가져오기
		String currDir = System.getProperty("user.dir");
		System.out.println(currDir);

		File dir = new File(currDir); // 객체 생성
		String ext = "." + args[0]; // args의 입력 문자에 . 추가해서 확장자 만들기

		delete(dir, ext);
		System.out.println(deletedFiles + "개의 파일이 삭제되었습니다.");

	}

	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				delete(files[i], ext);
				//재귀 호출 : 자신의 메소드를 호출
				//삭제 대상인 files[i]가 디렉토리라면, 그 폴더명으로 delete 다시 호출
				//폴더 들어가면서 txt 지우는 과정
			} else {
				String fileName = files[i].getAbsolutePath();
				
				if (fileName.endsWith(ext)) {
					System.out.println(fileName);
					if (files[i].delete()) { // delete - 파일 삭제
						System.out.println(" - 삭제 성공");
						deletedFiles++;
					} else {
						System.out.println(" - 삭제 실패");
					}
				}
			}
		}
	}

}
