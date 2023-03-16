package ch3;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		// 근무 시간 입력받기
		// 8시간 근무시 시간당 9800원일 때
		// 초과근무를 하게 되면 1.5배를 지급

		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간을 입력해주세요.");
		int hours = Integer.parseInt(sc.nextLine());
		int rate = 9800;
		int pay = 0;
		
		pay = hours <= 8 ? hours*rate : ((8*rate) + (hours-8)*rate*150/100);
		System.out.println("삼항연산자 일당은 = "+pay);
		
		if (hours<=8) {
			pay = hours*rate;
		}else {
			pay = 8*rate+(hours-8)*rate*150/100;
		}
		System.out.println("If문 일당은 = "+pay);

		// 키, 몸무게 입력받기
		// 저체중, 표준, 과체중 출력하는 프로그램 작성
		// (키 -100)*0.9 < 몸무게 : 과체중
		// (키 -100)*0.9 = 몸무게 : 과체중
//		 (키 -100)*0.9 > 몸무게 : 저체중
		System.out.println("키를 입력해주세요.");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("몸무게를 입력해주세요.");
		double weight = Double.parseDouble(sc.nextLine());
		double hwIndex = (height - 100) * 0.9;

		// If문
		String result = "표준";
		if (hwIndex < weight) {
			result = "과체중";
		} else if (hwIndex > weight) {
			result = "저체중";
		}
		System.out.printf("If문에 의해서는 %s입니다\n", result);

		// 삼항연산
		System.out.println(hwIndex < weight ? "과체중" : hwIndex > weight ? "저체중" : "표준");

		// 윤년, 평년 구하기
		int year = 2024;
		// 윤년 : 연도를 4로 나눈 나머지가 0 이고, 연도를 100으로 나눈 나머지가 0이 아니거나 연도를 400으로 나눈 나머지가 0이면 윤년

		boolean yoonYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

		if (yoonYear == true) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("평년입니다");
		}
		System.out.println(yoonYear == true ? "윤년" : "평년");

		// 임의의 숫자 3개 입력받기
		// 입력받은 3개의 숫자 중 가장 작은 수를 출력
		
		System.out.print("첫 번째 수 입력 : ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.print("두 번째 수 입력 : ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.print("세 번째 수 입력 : ");
		double c = Double.parseDouble(sc.nextLine());

		double minVal = a>b&&c>b ? b : a>c&&b>c ? c : a;
		
		System.out.printf("a = %.1f, b = %.1f, c = %.1f 중 최소값은 %.1f 입니다.\n",a,b,c,minVal);
		
		//방법 2
		double min = a;
		if (min>b) {
			min=b;
		}
		if (min>c){
			min=c;
		}
		System.out.println("가장 작은 수 "+ min);
		
		//방법 2의 max
		double max = a;
		if (max<b) {
			max=b;
		}
		if (max<c) {
			max=c;
		}
		System.out.println("가장 큰 수 "+max);
		sc.close();
	}
}
