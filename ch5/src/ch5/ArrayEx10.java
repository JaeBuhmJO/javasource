package ch5;

import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		String words[][] = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"Integer","상수"},
		};
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d) %s의 뜻은? : ",i+1,words[i][0]);			
			String answer = sc.nextLine();
			System.out.printf(answer.equals(words[i][1]) ? "정답입니다" : "오답입니다. 정답은 %s입니다.\n",words[i][1]);
		}
		
		
		//랜덤 영단어의 뜻을 맞추는 게임, 추가 문제 출제 가능하게
		//남은 기회를 디스플레이 해주고 3회 틀리면 다음 문제 넘어가고, 아니면 다시 푸는걸로
		
		int coin = 3;
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d) %s의 뜻은? : ",i+1,words[i][0]);			
			String answer = sc.nextLine();
			if (answer.equals(words[i][1])==true) {
				System.out.println("정답입니다.\n");
				coin = 3;
			}else {
				coin--;
				if (coin!=0) {
					System.out.printf("오답입니다. 남은 기회 : %d\n",coin); 
					i--;
				}else { 
					System.out.printf("오답입니다. 정답은 %s 입니다.\n", words[i][1]);
					coin = 3;
				}
			}
		}
		sc.close();

	}
}
