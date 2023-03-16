package ch6;

import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		// Student2 인스턴스 생성
		// 사용자로부터 입력을 받은 정보를 가지고 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("생성할 개수를 입력하세요");
		Student2 stuArr[] = new Student2[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < stuArr.length; i++) {
			System.out.print("이름, 반, 번호, 국어, 영어, 수학 점수를 차례로 입력해주세요");
			stuArr[i] = new Student2(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		// 향상된 for문 : for (타입 변수명 : 배열명) {}
		for (Student2 out : stuArr) {
			System.out.println(out);
		}
		sc.close();

	}

}
