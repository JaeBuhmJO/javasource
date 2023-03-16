package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {

	// 쇼핑몰 이름
	private String title;
	// user 정보 저장
	User[] users = new User[2];
	// Product 정보 저장
	Product[] products = new Product[4];
	// 구매한 제품을 저장할 배열(cart)
	Product carts[] = new Product[10];
	Scanner scanner = new Scanner(System.in);
	private int seluser;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// 유저 두 명 생성 후 배열에 담기
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("갤럭시", 1000000, "kt");
		products[1] = new CellPhone("아이폰", 1500000, "skt");
		products[2] = new SmartTv("올레드", 2000000, "UHD");
		products[3] = new SmartTv("QLED", 2500000, "4K");

	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType());
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
		case "0": case "1":
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
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
			products[i].printExtra();
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
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(sel)];
					break;
				}
			}
			productList();
			break;
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
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d]%s(%d원)\n", i, carts[i].getName(), carts[i].getPrice());
				payTotal += carts[i].getPrice();
			}
		}
		System.out.println("결제방법 : " + users[seluser].getPayType());
		System.out.println("결제금액 합계 : " + payTotal + "원 입니다.");
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String sel = scanner.nextLine();

		switch (sel) {
		case "p": case "P":
			productList();
			break;
		case "q": case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
		default:
			checkOut();
			break;
		}
	}

}
