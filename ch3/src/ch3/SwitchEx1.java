package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch문 : if-else if-else 대신 사용, case 문은 여러개로 늘려도 됨, 블록은 안씀. : break; 구조
//		switch (key) {
//		case value:
//			
//			break;
//		case value:
//			
//			break;
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		int month = 11;

		switch (month) {
		case 3: // month ==3; 비교 연산 불가 - 범위 구분 대상 사용 x
		case 4:
		case 5:
			System.out.println("현재 계절은 봄");
			break; // break에 논리가 도달하면 break가 속한 블럭을 빠져나옴
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재 계절은 겨울");
			break;
		}

		if (month < 3 || month == 12) {
			System.out.println("현재 계절은 겨울");
		} else if (month < 6) {
			System.out.println("현재 계절은 봄");
		} else if (month < 9) {
			System.out.println("현재 계절은 여름");
		} else {
			System.out.println("현재 계절은 가을");
		}

	}

}
