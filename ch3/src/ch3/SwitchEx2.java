package ch3;

public class SwitchEx2 {
	public static void main(String[] args) {
		// switch는 정수, 상수, 문자 들어올 수 있음

		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'a': // grade == 'a' || grade == 'A';
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
			break;
		}

		String position = "과장";
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}

	}

}
