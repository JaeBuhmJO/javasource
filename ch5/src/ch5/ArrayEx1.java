package ch5;

import java.util.Arrays;

/* 배열(Array)
 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
 * int score1 = 98, score2 = 88 , .........;
 * ==> int score[]; // 배열 선언
 * ==> score = new int[30]; // 배열 생성
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		
		// 연속된 공간에 int 값을 저장할 수 있는 30개의 공간 생성
		// index를 이용해서 접근을 할 수 있음, 0번에서 시작
		
		// 배열 선언 및 생성 한 번에
		int score[] = new int[30]; // int array 새로 만들 경우 0으로 초기화 됨

		// 새로운 값 할당이나 값에 접근은 index를 활용해서
		score[0] = 98;
		score[1] = 88;
		
		// 배열 선언, 생성 및 초기화 한 번에
		int score2[] = {98,45,12,68,12,35,75,19,84,52};
		
		System.out.println("5번째 학생의 점수 : " + score2[4]);
		
		double score3[] = {98.7,15.5,41.5,12.3,45.6,48.6,79.1,16.9,35.8,49.6};
		
		for (int i = 0; i < score3.length; i++) {
			System.out.println((i+1)+"번째 학생 점수 : "+score3[i]);
		}
		
		// char 5개를 담는 배열
		char charr[] = {'s','a','b','c','f'};
		System.out.println(charr);
		System.out.println(Arrays.toString(charr));
		
		// byte,char,short,int,long,float,double,boolean => 배열 타입 가능
		String strArr[] = {"abc", "def","ghi"};
		System.out.println(strArr[2]);
		System.out.println(Arrays.toString(strArr));

		
	}

}
