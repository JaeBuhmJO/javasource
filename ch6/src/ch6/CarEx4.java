package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		// 입력받은 값으로 Car3 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 Car3 인스턴스 수 : ");
		Car3 carArr[] = new Car3[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < carArr.length; i++) {

			System.out.print("회사명 >> ");
			String company = sc.nextLine();
			System.out.print("모델명 >> ");
			String model = sc.nextLine();
			System.out.print("색상명 >> ");
			String color = sc.nextLine();
			System.out.print("최대속도 >> ");
			int maxspeed = Integer.parseInt(sc.nextLine());
			carArr[i] = new Car3(company, model, color, maxspeed);
		}

		for (Car3 out : carArr) {
			System.out.println(out);
		}
		sc.close();

	}

}
