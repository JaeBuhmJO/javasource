package shop2;

import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {

	private String title;
	UserDTO[] users = new UserDTO[2];
	Product[] products = new Product[4];
	Product carts[] = new Product[10];
	Scanner sc = new Scanner(System.in);
	private int seluser;

	ProductDAO productDAO = new ProductDAO();
	UserDAO userDAO = new UserDAO();

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// user 정보를 입력받아서 suser 테이블에 저장
		System.out.println("***** User 입력 *****");
		UserDTO userDTO = new UserDTO();
		System.out.print("유저 id 입력 : ");
		userDTO.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.print("이름 입력 : ");
		userDTO.setName(sc.nextLine());
		System.out.print("결제 형태 입력(1. CARD / 2. CASH) : ");
		userDTO.setPayno(Integer.parseInt(sc.nextLine()));
		System.out.println(userDAO.insert(userDTO) ? "유저 추가 성공" : "유저 추가 실패");
	}

	public void userList() {
		System.out.println("***** User 목록 *****");
		List<UserDTO> list = userDAO.getList();
		System.out.println("UserID\tName\tPayno");
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserid() + "\t");
			System.out.print(userDTO.getName() + "\t");
			System.out.println(userDTO.getPayno());
		}
	}

	@Override
	public void genProduct() {
		ProductDTO productDTO = new ProductDTO();
		System.out.println("***** 상품 정보 입력 *****");
		System.out.print("Product ID : ");
		productDTO.setProductId(Integer.parseInt(sc.nextLine()));
		System.out.print("Pname : ");
		productDTO.setPname(sc.nextLine());
		System.out.print("Price : ");
		productDTO.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.print("Content : ");
		productDTO.setContent(sc.nextLine());
		System.out.println(productDAO.insert(productDTO) ? "상품 추가 성공" : "상품 추가 실패");

	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================");
		for (int i = 0; i < users.length; i++) {
//			System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x]종  료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
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
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
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
//		System.out.println("결제방법 : " + users[seluser].getPayType());
		System.out.println("결제금액 합계 : " + payTotal + "원 입니다.");
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();

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
