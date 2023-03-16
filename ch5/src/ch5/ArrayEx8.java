package ch5;

public class ArrayEx8 {
	public static void main(String[] args) {
		//2차원 배열
		//heap에는 각 행별 다른 주소를 가지고 저장되어있다.
		
		int [][] score = new int[4][3];
		int[] score2[] = new int[2][3];

		//행렬이니까 앞이 행index 뒤가 열index
		System.out.println(score2[0][0]);
		System.out.println(score2[1][2]);
		
		//행의 길이가 출력된다
		System.out.println(score2.length);
		
		//행 번호가 있으면 열의 길이가 출력된다
		System.out.println(score2[0].length);
		
		for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {
				score[i][j]= i+j;
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		
		//2차원 배열 선언, 생성, 초기화 한 번에 실행
		int score4[][] = {
				{10,11,12},
				{20,21,22}
		};
		
		//향상된 for문 - 줄이 짧고, 배열 index 한계를 크게 신경은 안 써도 된다.
		//사용은 좋으나 절대 수정은 할 수 없다.
		for (int arr[] : score4) { // score4 의 행을 가져와라 - arr[]로 해당 행변수 명명 - arr[]로서 활용
			for(int j:arr) { // arr의 자료 하나를 가져와라 - j로 해당 자료 명명 - j로서 활용
				System.out.printf("%d\t",j);
			}
			System.out.println();
		}
		
	}
}
