package ch6;

public class Car3 {
	String company;
	String model;
	String color;
	int maxSpeed;

	//생성자 오버로딩
	
	
	public Car3() {
		super();
	}

	@Override
	public String toString() {
		return "Car3 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	public Car3(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}

	public Car3(String company, String model, String color, int maxSpeed) {
//		super();
		this(company,model,color); // 생성자 호출은 첫 줄에만, super 비활성화
		this.maxSpeed = maxSpeed;
	}

	void forward() {
		System.out.println("전진한다");
	}

	void backward() {
		System.out.println("후진한다");
	}

}
