package ch6;

public class Square {
	//사각형의 넓이 구하기
	double width;
	double length;
	
		public Square(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	double getArea (){
		return width*length;
	}

}
