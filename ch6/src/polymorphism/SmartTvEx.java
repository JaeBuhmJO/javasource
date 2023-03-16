package polymorphism;

public class SmartTvEx {
	public static void main(String[] args) {
		//참조변수와 인스턴스 타입이 일치
		SmartTv smartTv = new SmartTv();
		
		//SmartTv = 자손 클래스, Tv = 부모 클래스
		//조상타입 참조변수로 자손 타입 인스턴스 참조
		Tv tv = new SmartTv();
		//실제로 생성된 객체는 SmartTv가 맞음
		//그렇지만 Tv가 원래 가지고 있는 멤버변수와 메소드밖에 접근 안됨
		
//		smartTv. - smartTv 멤버, 메소드까지 접근
//		tv. - Tv 멤버, 메소드까지만 접근
		//다형성
		//왼쪽은 무조건 부모, 오른쪽은 무조건 자손 클래스
		
		//참조변수의 타입에 따라 사용할 수 있는 멤버의 개수는 달라짐
		//tv와 smartTv로 접근할 수 있는 범위의 차이가 생김
		
//		SmartTv SmartTv2 = new Tv(); Type mismatch
		
	}

}
