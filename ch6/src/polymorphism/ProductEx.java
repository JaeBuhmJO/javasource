package polymorphism;

public class ProductEx {

	public static void main(String[] args) {
		// 구매자 인스턴스 생성
		Buyer buyer = new Buyer();
		
		//Tv 구매
		Tv1 tv1 = new Tv1();
		buyer.buy(tv1);
		buyer.buy(new Tv1()); // 왼쪽과 오른쪽이 같고 참조변수를 따로 안 쓸거라면
		
		//computer 구매
		Computer computer = new Computer();
		buyer.buy(computer);
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈은" + buyer.getMoney());
		System.out.println("현재 보너스 포인트는" + buyer.getBonusPoint());
		
	}

}
