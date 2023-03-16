package ch5;
/* 클래스
 * String : char 배열에 기능을 추가한 개념
 */
import java.util.Arrays;

public class ArrayEx7 {
	public static void main(String[] args) {
		// string 배열이 args 라는 변수명으로 선언된 것
//		System.out.println(args[0]); // indexOutOfBounds
		
		String name[] = new String[3];
		
		System.out.println(Arrays.toString(name));
		System.out.println(name[0]); //null : 참조타입에서 특정한 값이 할당되지 않은 상태
		
		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Yi";
		
		System.out.println(Arrays.toString(name));
		System.out.println(name[0].charAt(1));
		
		String str = "ABCDE";
		System.out.println(str.charAt(3)); // char의 Array index 3번을 불러온 것과 작동이 같다
		
		//문자열(String) 비교에는 == 을 사용하지 않음
		//equals() 또는 equalsIgnoreCase() 를 쓴다.
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		System.out.println(str.equals("abcde") ? "일치함" : "일치하지 않음");
		
		if(str.equals("abcde")) {
			System.out.println("일치함");
		}else {
			System.out.println("일치하지 않음");
		}
		
	}
}
