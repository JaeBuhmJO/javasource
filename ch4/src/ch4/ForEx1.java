package ch4;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할 때 사용
 * 종류: for(주로 사용됨), while, do-while
 */
public class ForEx1 {

	public static void main(String[] args) {
		// 1) int i =0; : 초기화
		// 2) i < 10; : 조건식 - false일 때 반복문이 바로 종료됨
		// 3) 블럭 안으로 진입
		// 4) i++
		// 5) 2)번 과정으로 회귀

		// 0에서 9까지
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 10에서 1까지
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 3 5 7 9
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 헬로 월드 3연타
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello World!");
		}

		// 1~100까지 출력하는데 계단형으로 디스플레이
		int row = 1;
		int column = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			column += 1;
			if (row == column) {
				System.out.println();
				column = 0;
				row += 1;
			}
		}
		System.out.println();

		// 1 ~ 10까지 덧셈 결과 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10의 합 " + sum);

	}
}