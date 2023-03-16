package ch6;

public class GoodsstockEx1 {

	public static void main(String[] args) {
		//티셔츠 상품관리
		
		//객체 생성 - 클래스명 변수명 = new 클래스명();
		//객체 생성하면 생성자는 무조건 자동 호출
		GoodsStock goods = new GoodsStock("p123456",150); // 소괄호 내에 입력값 없으면 기본 생성자를 호출
		//생성자에 있는 매개변수 개수와 입력 항목 차이가 나면 객체 생성 에러남
		//자료형과 매개변수 가지 수 일치해야함
		//여러 생성자 형태를 만들 수 는 있음
		
		System.out.println("현재 재고수량" + goods.stockNum);
		
		goods.subtractStock(10);
		System.out.println("현재 재고수량" + goods.stockNum);
	}

}
