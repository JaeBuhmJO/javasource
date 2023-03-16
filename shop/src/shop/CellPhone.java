package shop;

public class CellPhone extends Product {
	String carrier;

	// CellPhone의 이름과 가격 출력 메소드

	public CellPhone() {
		super();
	}

	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier = carrier;
	}

	// 통신사 정보 출력 메소드
	@Override
	public void printExtra() {
		System.out.println("통신사 정보 : " + carrier);
	}

}
