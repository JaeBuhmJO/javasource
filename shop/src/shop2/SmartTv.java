package shop2;

public class SmartTv extends Product {
	String resolution;

	// SmartTv의 이름과 가격 출력 메소드

	public SmartTv() {
		super();
	}

	public SmartTv(String name, int price, String resolution) {
		super(name, price);
		this.resolution = resolution;
	}

	// 해상도 정보 출력
	@Override
	public void printExtra() {
		System.out.println("해상도 정보 : " + resolution);
	}

}
