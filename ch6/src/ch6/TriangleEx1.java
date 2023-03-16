package ch6;

public class TriangleEx1 {

	public static void main(String[] args) {
		// 객체 생성 및 매개변수를 통한 초기화
		Triangle triangle = new Triangle(3, 5);

		// 메소드 호출
		System.out.println("삼각형의 넓이 = " + triangle.getArea());
	}

}
