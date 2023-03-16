package lang;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {
		// String 생성자

		// new String (char value[])
		char c[] = { 'H', 'e', 'l', 'l', 'o' };
		String str1 = new String(c);

		System.out.println(str1);
		String str2 = "Hello";

		System.out.println(str1.length());

		// charAt(int index) : char => charAt 호출 시 int 매개변수를 투입, char 결과값
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length() - 1));

		String str3 = "자바 프로그래밍";
		// str3 문자열에 '프' 문자가 들어있는지 확인

		boolean contain = false;
		for (int i = 0; i < str3.length(); i++) {
			if (str3.charAt(i) == '프') {
				contain = true;
			}
		}
		System.out.println(contain ? "프 포함되어있음" : "프 포함되어있지 않음");

		// indexOf(int ch) 주어진 문자 ch가 문자열에 들어있는지 확인하고 Index값 리턴, 없으면 -1
		System.out.println("indexOf o: " + str2.indexOf('o'));
		System.out.println("indexOf l: " + str2.indexOf('l'));
		System.out.println("indexOf llo: " + str2.indexOf("llo")); // 시작위치 Index 리턴
		System.out.println("indexOf e,0: " + str2.indexOf("e", 0));
		System.out.println("indexOf e,1: " + str2.indexOf("e", 1)); // int Index 에서부터 앞의 값 찾아서, 'Index' 리턴
		System.out.println("indexOf e,2: " + str2.indexOf("e", 2));

		// lastIndexOf
		System.out.println("lastIndexOf o: " + str2.lastIndexOf('o'));
		System.out.println("lastIndexOf l: " + str2.lastIndexOf('l'));

		System.out.println(str3.indexOf('프') > -1 ? "프 포함되었음" : "프 포함 안되었음");

		// substring
		String numList = "0123456789";
		String ssn = "880515-1222012";

		// substring(int beginIndex)
		String subList = numList.substring(3);
		System.out.println("(int beginIndex 3)" + subList);
		// substring(int beginIndex,int endIndex)
		System.out.println("(int beginIndex 3,int endIndex 8)" + numList.substring(3, 8));
		// beginIndex에서 endIndex *전*까지

		// concat()
		System.out.println(str2);
		String result2 = str2.concat("안녕하세요"); // + 같은 역할
		System.out.println(result2);

		// startsWith() - boolean 리턴
		String str4 = "java.lang.object";
		System.out.println(str4.startsWith("j")); // 입력값으로 시작하는지
		System.out.println("startsWith(String prefix,int tOffset) " + str4.startsWith("java", 3));
		// tOffset 위치가 입력값으로 시작하는지 boolean 리턴 좀

		// endsWith() suffix로 끝나느냐
		System.out.println("endsWith(String suffix) " + str4.endsWith("java"));
		System.out.println("endsWith(String suffix) " + str4.endsWith("object"));

		// contains() 해당 문자를 가지고 있느냐 - boolean
		System.out.println(str2 + " contains \"Hello\" " + str2.contains("Hello"));

		// replace() target 을 new 글자로 변경 - String 리턴
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		System.out.println(str5.replace("자바", "java"));
		System.out.println(str5); // String은 immutable, 변경 불가능
		// replace 메소드 돌려도 str5 원본은 변경되지 않는다.
		// 변경한 *새로운* 문자열을 리턴했을 뿐
		str5 = str5.replace("자바", "java");
		System.out.println(str5);
		// 바꾼걸 다시 담으면 바뀌긴 한다, 근데 주소 값도 바뀜

		System.out.println(str5.replaceFirst("j", "J"));
		// target 찾아서 new로 맨 첫 교체만 시행
		System.out.println(str5.replaceAll("j", "J"));

		// 공백, 개행문자도 문자다
		// trim() - 처음과 끝에 있는 공백만 제거한다
		String str6 = "   Hello World   ";
		System.out.println(str6);
		System.out.println(str6.length());
		System.out.println(str6.trim());
		System.out.println(str6.trim().length());

		System.out.println(str6.equals("Hello World"));
		System.out.println(str6.trim().equals("Hello World"));

		// valueOf() - 투입 가능한 형 다양함, 전부 스트링으로 리턴
		System.out.println(String.valueOf(true)); // => "true"
		System.out.println(String.valueOf('c')); // => "c"
		System.out.println(String.valueOf(100)); // => "100"
		
		String animals = "dog,cat,bear";
		String[] aniArr = animals.split(",");
		System.out.println(Arrays.toString(aniArr));

		//split(String regex, int limit) : regex로 나누되, limit 개수까지만
		aniArr = animals.split(",", 2);
		System.out.println(Arrays.toString(aniArr));
		for (int i = 0; i < aniArr.length; i++) {
			System.out.println(aniArr[i]);
		}
		
		//compareTo(String str) : str 문자열 비교(사전 순서)
		//첫 글자 기준으로 같으면 0, 다음 글자 비교로 넘어감
		//사전 순으로 이전이면 음수, 이후면 양수
		System.out.println("aaa".compareTo("a")); // 이건 또 2?
		System.out.println("aaa".compareTo("aa")); // 이게 왜 1?
		System.out.println("aaa".compareTo("aaa")); // 0
		System.out.println("aaa".compareTo("bbb")); // -1 = 97 - 98
		System.out.println("bbb".compareTo("aaa")); // 이건 또 1 = 98 - 97
		System.out.println("bbb".compareTo("bxy")); 
		// b compare, 그리고 나서 b x compare로 넘어감
		
		//join() = 배열의 개별값을 특정 문자열(구분자)와 함께 결합
		aniArr = animals.split(",");
		System.out.println(Arrays.toString(aniArr));
		String str8 = String.join("-", aniArr);
		System.out.println(str8);
	}

}
