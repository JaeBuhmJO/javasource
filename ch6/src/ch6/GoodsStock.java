package ch6;

public class GoodsStock {
	//상품관리용 클래스
	
	//속성
	//상품코드(입력값 예시 : p123456)
	//재고수량(입력값 예시 : 200)
	String Code;
	int stockNum;
 
	@Override
	public String toString() {
		return "GoodsStock [Code=" + Code + ", stockNum=" + stockNum + "]";
	}

	public GoodsStock(String code, int stockNum) {
		super();
		Code = code; // 생성자의 매개변수와 생성자()속의 변수명이 다르면 this 생략될 수 있다.
		this.stockNum = stockNum;
	}

	//클래스 내 생성자를 '하나도 명시하지 않으면'
	//기본 생성자를 알아서 하나 생성해준다.
	
	
	//기능
	//재고수량 감소
	void addStock(int amount) {
		stockNum+=amount;
		System.out.println("재고수량 증가");
	}
	//재고수량 증가
	void subtractStock(int amount) {
		stockNum-=amount;
		System.out.println("재고수량 감소");
	}
	
}