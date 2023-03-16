package polymorphism;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) { // 매개변수 다형성 활용 의도
		if (money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	public int getMoney() {
		return money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
	
}
