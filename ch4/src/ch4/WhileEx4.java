package ch4;

public class WhileEx4 {
	public static void main(String[] args) {
		// while, Math.random() 사용
		// 두 개의 주사위를 던져 나오는 값을 (값1,값2) 형태로 출력하고
		// 값의 합이 5가 아니면 계속 주사위를 던지고, 5인 경우 실행 종료

		int dice1 = 0;
		int dice2 = 0;

		while (true) {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d,%d)\n", dice1, dice2);
			if (dice1 + dice2 == 5) {
				break;
			}
		}

//		if - break 에 블럭을 안 친 이유
//		for, if, while 세 개의 경우 수행할 문장이 하나라면 블럭을 생략할 수 있음 (do-while은 안됨)
//		블럭 생략한 채 여러 문장 입력 시 바로 아래 문장 하나만 for, if, while 인걸로 해석한다.
//		그러나 아직은 익숙해지는 단계이므로, 블럭을 쳐가면서 연습하자
		System.out.println();

		do {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.printf("%d,%d\n", dice1, dice2);
		} while (dice1 + dice2 != 5);

//		if(조건) {
//			수행할 문장
//		}

	}
}