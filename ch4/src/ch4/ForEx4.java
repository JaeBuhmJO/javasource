package ch4;
/*중첩 for
 * for문 안에 for문 포함
 */

public class ForEx4 {
	public static void main(String[] args) {

		// 증감연산식은 블럭이 끝나고 난 후에 계산된다.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 변환되는 부분이 뭔지 확인 -> 줄 마다 *찍기의 시행 횟수 -> 여기를 변수로

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 4x+5y=60 의 모든 해 구하기
		// 단, x, y는 10 이하의 자연수

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("x = %d, y = %d\n", x, y);
				}
			}
		}

		// break;
		// 자신이 포함된 가장 가까운 반복문을 벗어나게됨 (주로 if와 같이 사용됨)

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5)
				break;
		}

		//continue;
		//반복문 내에서만 사용
		//반복이 진행되는 도중에 continue 문을 만나면 이후 내용은 전부 skip 하고 반복문의 끝으로 이동
		//다음 루프차례를 수행함
		
		for (int i = 0; i < 10; i++) {
			if (i%3==0) continue;
				System.out.print(i);
		}

	
	}
}