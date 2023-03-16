package ch3;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		//중첩if
//		if (condition) {
//			if (condition) {
//				code
//			}else if (condition) {
//				else if code
//			}else {
//				else code
//			}
//		}

		//점수를 입력받아서 점수가 90 이상이면 A 인데, 98 이상이라면 A+, 94미만이라면 A-, 나머지는 그냥 A
		//점수를 입력받아서 점수가 80 이상이면 B 인데, 88 이상이라면 B+, 84미만이라면 B-, 나머지는 그냥 B
		//점수가 80 미만이면 그냥 C
		
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.nextLine());
		char grade = ' ', opt = '0';
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt ='+';
			}else if (score < 94) {
				opt ='-';
			}
		}else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt ='+';
			}else if (score < 84) {
				opt ='-';
			}
		}else {
			grade = 'C';
		}
		System.out.println("귀하의 성적은 " + grade + opt +" 입니다.");
		sc.close();
	}
}
