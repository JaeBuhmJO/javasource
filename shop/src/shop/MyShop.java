package shop;

import java.util.ArrayList;
import java.util.Scanner;

/* 배열로 선언된 부분 => ArrayList로 변경
 * 전체 구동 가능하게 수정
 */

public class MyShop implements IShop {

	// 쇼핑몰 이름
	private String title;
	// user 정보 저장 ArrayList
	ArrayList<User> users = new ArrayList<>();
	// Product 정보 저장 ArrayList
	ArrayList<Product> products = new ArrayList<>();
	// 구매한 제품을 저장할 carts ArrayList
	ArrayList<Product> carts = new ArrayList<>(10);
	Scanner scanner = new Scanner(System.in);
	private int seluser;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// 유저 두 명 생성 후 배열에 담기
		users.add(new User("홍길동", PayType.CARD));
		users.add(new User("성춘향", PayType.CASH));
	}

	@Override
	public void genProduct() {
		products.add(new CellPhone("갤럭시 노트 10", 500000, "SKT"));
		products.add(new CellPhone("애플 아이폰 13", 900000, "U+"));
		products.add(new SmartTv("삼성 3D Smart", 1500000, "4K"));
		products.add(new SmartTv("LG Smart Tv", 1200000, "Full HD"));

	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================");
//		for (int i = 0; i < users.size(); i++) {
//			System.out.printf("[%d]%s(%s)\n", i, users.get(i).getName(), users.get(i).getPayType());
//		}
		int i = 0;
		for (User user : users) {
			if (user != null) {
				System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
			}
		}
		System.out.println("[x]종  료");
		System.out.print("선택 : ");
		String sel = scanner.nextLine();
		System.out.println("## " + sel + " 선택 ##");

		// 0,1 => productList() 호출
		// 다른걸 입력 시 => 메뉴를 확인해주세요
		switch (sel) {
		case "x":
		case "X":
			System.exit(0); // 프로그램 종료
			break;
		case "0":
		case "1":
			productList();
			seluser = Integer.parseInt(sel);
			break;
		default:
			System.out.println("메뉴를 확인해주세요\n");
			start();
			break;
		}
	}

	public void productList() {
		for (int i = 0; i < products.size(); i++) {
			System.out.printf("[%d]", i);
			products.get(i).printDetail();
			products.get(i).printExtra();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String sel = scanner.nextLine();
		// 상품 선택 시 0~3 - cart에 제품 추가, 다시 상품 목록 호출
		// 메뉴 선택 시 h - start(),c - checkout 호출

		switch (sel) {
		case "0":
		case "1":
		case "2":
		case "3":
//			for (Product cart : carts) {
				carts.add(products.get(Integer.parseInt(sel)));
				productList();
				break;
//	}	
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			System.out.println("잘못된 선택입니다.");
			productList();
			break;
		}

	}

	public void checkOut() {
		System.out.println("MyShop : 체크아웃");
		System.out.println("=====================");
		int payTotal = 0;
		int index = 0;
//		for (Iterator iterator = carts.iterator(); iterator.hasNext();) {
//			Product cart = (Product) iterator.next();
//			System.out.printf("[%d]%s(%d원)\n", index++, cart.getName(), cart.getPrice());
//			payTotal += cart.getPrice();
//		}
		for (Product cart : carts) {
			System.out.printf("[%d]%s(%d원)\n", index++, cart.getName(), cart.getPrice());
			payTotal += cart.getPrice();
		}

//		for (int i = 0; i < carts.size(); i++) {
//			if (carts.get(i) != null) {
//				System.out.printf("[%d]%s(%d원)\n", i, carts.get(i).getName(), carts.get(i).getPrice());
//				payTotal += carts.get(i).getPrice();
//			}
//		}
		System.out.println("결제방법 : " + users.get(seluser).getPayType());
		System.out.println("결제금액 합계 : " + payTotal + "원 입니다.");
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String sel = scanner.nextLine();

		switch (sel) {
		case "p":
		case "P":
			productList();
			break;
		case "q":
		case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
		default:
			checkOut();
			break;
		}
	}

}
