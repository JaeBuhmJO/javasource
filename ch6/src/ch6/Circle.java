package ch6;

public class Circle {
	//속성
	//반지름
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	//기능
	//넓이 구하기
	double getArea() {
		return radius*radius*Math.PI;
	}
	
}

