package io;
/*
 * 
 */

/* I/O
 * Input/Output
 * Input : 키보드
 * Output : 화면
 * 
 * 스트림(Stream) : 한쪽에서 다른 쪽으로 데이터를 전달하기 위해,
 * 				  두 대상을 연결하고 데이터를 전송할 수 있는 것
 * 
 * 	1) 바이트 기반 스트림 : 바이트 단위로 데이터를 전송
 * 						FileInputStream, FileOutputStream
 *  2) 문자 기반 스트림 : 문자 단위로 데이터를 전송
 *  					FileReader, FileWriter, ...
 */

/* InputStream
 * read(byte[] b) : byte 배열만큼 읽어옴(더 없으면 -1 리턴)
 * write(byte[] b) : byte 배열만큼 쓰기
 * 
 * 읽어온 바이트 수 - 실제로 들어있는 바이트 수
			int nameByte = in.read(b);
 * enter : carriage return + line feed -> 두 바이트로 구성
			String name = new String(b,0,nameByte-2);
 * 
 */

/* java.io.file
 * 자바에서 파일 다루기
 * 
 * File(String pathname)
 * File(String parent, String child)
 * File(file parent, String child)
 * file(URL url)
 * 
 * 주요 메소드
 * getName() : 파일명 가져오기 (경로 제외)
 * getpath() : 파일명, 확장자 포함 경로 가져오기
 * getAbsolutePath() : 절대경로 가져오기
 * getCanonicalPath() : 정규경로 가져오기
 * getParent() : 파일 속한 dir까지의 경로 가져오기
 * 
 * pathSeparator : 운영체제에서 사용하는 경로 구분자 알려주기(윈; 유닉스:)
 * Separator : 운영체제에서 사용하는 이름 구분자 알려주기(윈\ 유닉스/)
 * 
 * listFiles() : 지정한 경로에 있는 폴더/파일명 배열로 읽어옴
 * delete() - 파일 삭제
 * 
 * 재귀 호출 : 자신의 메소드를 호출
 * 
 * mkdir(), mkdirs() : 디렉토리 생성
 */

/* FileInput 관련
 * text : Byte 기반, 문자기반(FileReader)
 * 음악, 동영상, 이미지 : Byte 기반(FileInputStream)
 */

/* try-with-resource
 * Closable을 구현한 클래스여야 함
 * try () { // 소괄호 안의 객체가 알아서 닫혀야함
 * }catch{
 * }
 */

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

/* 직렬화(Serialization)
 * 객체를 데이터 스트링으로 만드는 것
 * => 객체에 저장된 데이터를 스트림에 쓰기 위해 연속적인 데이터로 변환
 * ObjectOutputStream : 스트림에 객체를 출력
 * 
 * NotSerializableException
 * Serializable - 직렬화 구현 - 객체를 파일에 쓰기 위해서
 * 
 * 
 * 
 * 역직렬화(deserialization)
 * 스트림으로부터 데이터를 읽어서 객체를 만드는 것
 * 
 */

public class A_note {

}
