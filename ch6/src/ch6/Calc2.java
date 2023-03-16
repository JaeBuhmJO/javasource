package ch6;

/*메소드 오버로딩
 * 메소드 이름이 같아야함
 * 매개변수의 개수 또는 타입이 달라야 함
 * 반환타입은 상관없음
 * 입력값에 따라 어떤게 적용되는지 자바가 판단 가능해야함
 */
public class Calc2 {
	int add(int a, int b) {
		return a + b;
	}

//	long add(int num1, int num2) { // add(int int) 기 때문에 1번 메소드와 중복 에러
//		return a + b;
//	}
	
	float add(int a, float b) {
		return a + b;
	}

	long add(int a, long b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int add(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

}
