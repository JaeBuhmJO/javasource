package polymorphism;

public class Product {
	int price;
	int bonusPoint;
	
//	toString Object 클래스가 가지고 있어서, 따로 특정 안해도 오버라이드 가능
	
	public Product() {
		super();
	}

	public Product(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
}
