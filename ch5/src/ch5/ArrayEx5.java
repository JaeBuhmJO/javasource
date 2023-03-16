package ch5;

import java.util.Arrays;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			// 0~9 사이의 임의의 값 구하기
			// 임의의 값 인덱스 자리에 있는 수를 0번째 있는 자리와 순서 교체
			int j = (int) (Math.random() * 10);
			int temp = numArr[j];
			numArr[j] = numArr[0];
			numArr[0] = temp;
		}

		System.out.println(Arrays.toString(numArr));
	}
}
