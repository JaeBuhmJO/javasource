package shop2;

import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {

	private String title;
	private int selUser;

	ProductDAO productDAO = new ProductDAO();
	UserDAO userDAO = new UserDAO();
	OrderDAO orderDAO = new OrderDAO();

	Scanner sc = new Scanner(System.in);

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
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

		// 전체 user 정보 출력
		List<UserDTO> list = userDAO.getList();
		System.out.println("UserID\tName\tPayno");
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserid() + "\t");
			System.out.print(userDTO.getName() + "\t");
//			System.out.print(userDTO.getPayno()+"\t");
			System.out.println(userDTO.getType());
		}

		System.out.println("[x]종  료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## " + sel + " 선택 ##");

		switch (sel) {
		case "x":
		case "X":
			System.exit(0); // 프로그램 종료
			break;
		case "1000":
		case "1001":
			selUser = Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해주세요\n");
			start();
			break;
		}
	}

	public void productList() {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("==========================");

		List<ProductDTO> list = productDAO.getList();
		System.out.println("No\tPname\t\tPrice\t  Content");
		System.out.println("------------------------------------------");

		for (ProductDTO product : list) {
			System.out.print(product.getProductId() + "\t");
			System.out.print(product.getPname() + "\t");
			System.out.print(product.getPrice() + "\t  ");
			System.out.print(product.getContent() + "\n");
		}

		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String sel = sc.nextLine();

		switch (sel) {
		case "1001":
		case "1002":
		case "2001":
		case "2002":
			System.out.println(orderDAO.insert(selUser, Integer.parseInt(sel)) ? "상품이 장바구니에 담겼습니다" : "구매 오류");
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
		List<OrderDTO> list = orderDAO.carts(selUser);

		for (OrderDTO orderDTO : list) {
			System.out.print(orderDTO.getUserDTO().getUserid() + "\t");
			System.out.print(orderDTO.getUserDTO().getName() + "\t");
			System.out.print(orderDTO.getPayType() + "\t");
			System.out.print(orderDTO.getProductDTO().getProductId() + "\t");
			System.out.print(orderDTO.getProductDTO().getPname() + "\t");
			int price = orderDTO.getProductDTO().getPrice();
			System.out.print(price + "\t");
			payTotal += price;
			System.out.print(orderDTO.getProductDTO().getContent() + "\t");
			System.out.println(orderDTO.getOrderDate());
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
			// sorder.delete(userId)
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
		default:
			checkOut();
			break;
		}
	}

}
