package inheritance;

public class SmartTvEx2 {

	public static void main(String[] args) {
		SmartTv2 stv = new SmartTv2(false,10);
		//1. 자식 클래스 생성자 실행
		//2. super;를 타고 부모 클래스 생성자 실행
		//3. super;를 타고 Object 클래스 도달
		// => SmartTv2, Tv2, Object 인스턴스가 모두 생성됨
		
		//상속 여부 확인
		stv.channel = 10;
		stv.channelUp();
		System.out.println("현재 채널 : "+stv.channel);
		stv.power();
		System.out.println("전원 상태 : "+stv.power);
		
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");
		
	}

}
