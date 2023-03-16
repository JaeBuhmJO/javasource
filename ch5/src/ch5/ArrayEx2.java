package ch5;

import java.util.Arrays;

/* 기본타입 - stack 만 쓴다
 * byte,char,short,int,long,float,double,boolean 등
 * int num1 = 0; 등을 하면 stack의 특정 주소에 값이 저장된다
 * num1 = 15; 시 저장됐던 주소에서 값이 변경된다
 * 
 * 참조타입 - stack과 heap 영역을 사용
 * String(class), Array 등
 * int score[] = new int[5]; 등을 하면 
 * 1. heap 영역의 특정 주소에 값이 저장된다.
 * 2. stack에는 heap영역 주소값이 저장된다.
 * -> 그래서 System.out.println(score); 를 하면 score 변수의 stack 저장값인 heap 주소를 출력한다.
 * **근데 char array는 주소가 아니라 char 나열이 출력
 */

public class ArrayEx2 {
	public static void main(String[] args) {
		int score[] = new int[5];

		for (int i = 0; i < score.length; i++) {
			score[i] = i * 10;
		}
		
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		System.out.println();

		// 향상된 for문
		for (int i : score) { // score 1행을 가져와서 i 자리에 순차 대입, 루프
			System.out.println(i);
		}
		
		//1~10 사이의 임의의 숫자를 생성해서 배열에 저장
		int iArr2[] = new int[10];
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(iArr2));
		
		//char array : 순서대로 나열 출력됨 - array 출력시 유일한 예외사항
		char charr[] = {'s','a','b','c','f'};
		System.out.println(charr);
		
		//String array : 형식과 저장주소 출력됨
		String strArr[] = {"abc", "def","ghi"};
		System.out.println(strArr);
		
	}

}
