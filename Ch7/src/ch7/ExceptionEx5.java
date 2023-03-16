package ch7;

public class ExceptionEx5 {

	public static void main(String[] args) {
		int arr[] = new int[0];
		try {
			getAverage(arr);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	// getAverage 메소드에 예외 선언 - 예외 선언된 메소드는 사용시 예외처리 해야함
	// getAverage 메소드를 호출하면 예외가 발생할 수 있음
	static double getAverage(int arr[]) throws Exception {
		// 강제로 예외 발생
		if (arr.length == 0) {
			// throw - 강제 예외발생 // throws - 예외 던지기
			throw new RuntimeException("비어있는 배열입니다");
//			throw new Exception("비어있는 배열입니다"); : 이거는 컴파일 에러
//			: Exception 클래스 - 컴파일시 예외 발생으로 처리
//			처리 방법 - 컴파일 예외 발생 위치 블록에서 throws Exception
		}
		return getTotal(arr) / arr.length;
	}

	static int getTotal(int arr[]) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

}
