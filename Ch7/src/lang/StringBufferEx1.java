package lang;

/* 자바에서 문자열 다루기
 * 1) String
 * 2) StringBuffer : 원본 문자열 변경 가능 / 멀티쓰레드 안전
 * 3) StringBuilder : 원본 문자열 변경 가능 // StringBuffer - 멀티쓰레드 클래스
 */

public class StringBufferEx1 {
	public static void main(String[] args) {
		//Constructs a string buffer *with no characters* in it 
		//and an initial capacity of 16 characters.
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100); // 버퍼의 크기가 100
		StringBuffer sb3 = new StringBuffer("Hello"); 
		//Constructs a string buffer 
		//*initialized to the contents* of the specified string.
		
//		StringBuffer sb4 = "Hello"; 불가능 => String만 허용
		System.out.println(sb2);
		System.out.println(sb3);
		
		//append() - 원본 문자열 뒤에 추가, 주소변동 x
		sb2.append(false);
		sb2.append("abc");
		sb2.append('d');
		System.out.println(sb2);
		
		sb2.append(false).append("abc").append('d'); // 이것도 문제없음
		System.out.println(sb2);
		
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println(sb3.equals(sb4)); // equals 오버라이드 안돼있음
		//값 비교하려면 스트링으로 변경해야함 toString()
		String str1 = sb3.toString();
		String str2 = sb4.toString();
		System.out.println(str1.endsWith(str2));
		
		//delete(int start, int end)
		StringBuffer sb5 = new StringBuffer("0123456");
		StringBuffer sb6 = sb5.delete(3, 6); // 인덱스 3에서 6 전까지 delete
		//인덱스 3부터 지워나가고, 6부터 다시 저장
		System.out.println(sb5); // 원본 변경 가능, sb5도 수정되어있음
		System.out.println(sb6);
		
		//deleteCharAt(int index) : index에 있는 char 제거
		sb5 = new StringBuffer("0123456");
		sb6 = sb5.deleteCharAt(4); // 인덱스 3을 delete
		System.out.println(sb5); // 원본 변경 가능, sb5도 수정되어있음
		System.out.println(sb6);
		
		//insert(int index, char char) // 입력값이 index번호에 생성됨
		sb5.insert(4, "-");
		System.out.println(sb5);
		
		//replace()
		sb5 = new StringBuffer("0123456");
		sb5.replace(2, 6, "A"); //2에서부터 지우고 A저장, 6부터 다시 저장
		System.out.println(sb5);
		
		str2 = "0123456789";
		//역 순서로 출력하기
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(str2.length()-1-i));
		}
		System.out.println();
		sb5 = new StringBuffer(str2);
		sb5.reverse();
		System.out.println(sb5);
		
		//setCharAt()
		sb5 = new StringBuffer("0123456");
		sb5.setCharAt(4, 'A'); // index 위치의 char를 입력char로 교체
		System.out.println(sb5);
		
	}

}
