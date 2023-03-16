package ch6;

import java.util.Scanner;

public class GoodsstockEx2 {

	public static void main(String[] args) {
		// 입력값으로 GoodsStock 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 상품의 개수를 입력 : ");
		GoodsStock goodsArr[] = new GoodsStock[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < goodsArr.length; i++) {
			System.out.print("상품코드 : ");
			String code = sc.nextLine();
			System.out.print("재고수량 : ");
			int stockNum = Integer.parseInt(sc.nextLine());
			goodsArr[i] = new GoodsStock(code, stockNum);
			System.out.println("-------------------------");
		}
		
		for (GoodsStock out : goodsArr) {
			System.out.println(out);
		}
		sc.close();

	}

}
