package polymorphism;

public class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;

	Product cart[] = new Product[5]; // 구입한 제품을 저장하기 위한 배열
	// Tv, Audio, computer 등 모든 자식을 한 곳에 담을 수 있는 배열
	int i = 0;

	void buy(Product p) { // 매개변수 다형성 활용 의도
		if (money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구매하셨습니다.");
	}

	void summary() {
		int priceSum = 0;
		String itemList = "";
		for (int i = 0; i < cart.length; i++) {
			if (cart[i]==null) {
				break;
			}
			priceSum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("총 구매 물품 : "+itemList);
		System.out.println("총 구매금액 : "+priceSum+"만원 입니다.");
	}
	

	public int getMoney() {
		return money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

}
