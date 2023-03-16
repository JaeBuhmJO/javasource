package inheritance;

public class Computer extends Calculator{
	
	@Override // 수행 내용 뭐 하나라도 달라야 Override 하는 의미가 있음
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI*r*r; // Math 클래스의 static/클래스 상수 PI를 호출. 
	}
}
