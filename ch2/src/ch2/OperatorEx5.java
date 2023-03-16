package ch2;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {

		// 문제1) 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 떄
		// 학생 한 명당 몇 개를 가질 수 있고, 남는 연필은 몇 개인지 출력
		// 출력예제) 학생 한 명당 : 30
		// 남은 연필 수 : 5

		int pen = 534, student = 30;

		System.out.printf("학생 한 명당 연필은 %d자루 씩 가질 수 있고\n남는 연필은 %d자루 입니다.\n", pen / student, pen % student);

		// 문제2) 사다리꼴 너비 구하기
		// 윗변 : 5, 아랫변 : 10, 높이 7 인 사다리꼴 너비 구하기
		// 변수 사용, 소수 자릿수까지 출력

		double top = 5, bottom = 10, height = 7;
		double area = ((top + bottom) / 2) * height;
		System.out.printf("사다리꼴의 넓이는 %.1f 입니다.\n", area);

		// 문제3) 한달월급을 10년동안 저축할때 최종 저축금액 구하기
		// 조건 : 사용자로부터 한달 월급 입력받기
		// 출력 예시 : 10년 저축 금액 : 2000000

		Scanner sc = new Scanner(System.in);

		System.out.println("한 달 월급 금액을 숫자로 입력해주세요.");
		int salary = Integer.parseInt(sc.nextLine());

		int tenYearSalary = salary * 12 * 10;
		System.out.printf("월급 %d원을 10년간 저축한 원금은 %d원 입니다.\n", salary, tenYearSalary);

		// 문제4) 화씨 온도를 섭씨 온도로 변경하기
		// 화씨 온도가 100일 때 섭씨온도가 얼마인지 출력하기
		// 섭씨온도 = 5/9 * (화씨온도-32) 임
		System.out.println("화씨 온도를 숫자로 입력해주세요.");
		double fDegree = Double.parseDouble(sc.nextLine());

		double cDegree = (fDegree - 32) * 5 / 9; // 이미 fDegree가 double 형으로 시작하기때문에, 그 뒤의 계산도 전부.
		double c2Degree = 5.0 / 9 * (fDegree - 32); // 5/9로 시작하면 정수 나눗셈, 몫 0으로 끝나버림. 형변환 해야

		System.out.printf("화씨 %.1f도는 섭씨 %.1f도 입니다.\n", fDegree, cDegree);
		System.out.printf("화씨 %.1f도는 섭씨 %.1f도 입니다.\n", fDegree, c2Degree);

		// 문제5) 삼항연산자 이용
		// int num =10 일때 num이 양수인지, 음수인지, 0인지 출력
		int num = 10;
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		System.out.println(result);

		// 문제6) 숫자를 입력받아 짝수인지, 홀수인지 출력하기
		System.out.println("정수를 입력해주세요.");
		int input = Integer.parseInt(sc.nextLine());
		String ifeven = input % 2 == 0 ? "짝수" : "홀수";
		System.out.println(ifeven);
		
		sc.close();

	}

}
