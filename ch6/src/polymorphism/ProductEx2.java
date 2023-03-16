package polymorphism;

public class ProductEx2 {

	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2();
		
		buyer.buy(new Tv1());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		
		buyer.summary();
		
		
	}

}
