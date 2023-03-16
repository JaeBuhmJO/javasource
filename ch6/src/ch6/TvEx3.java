package ch6;

public class TvEx3 {

	public static void main(String[] args) {
		//객체 생성
		Tv3 tv = new Tv3();
		Tv3 tv2 = new Tv3("White",7,false);

		//초기화 -> class의 property private 설정시 직접초기화 불가능
		//이 경우 property 초기화 방법
		//1. 매개변수가 있는 생성자
		//2. 멤버 변수의 값 변경 위한 메소드 제공
		
		//현재 채널 정보를 알고 싶다면?
		//현재 채널 정보를 제공하는 메소드를 만들어야함
		System.out.println("현재 채널 : " + tv.getChannel());
		System.out.println("현재 색상 : " + tv.getColor());
		System.out.println("현재 전원 : " + tv.isPower());

		// tv2 채널 변경
		tv2.setChannel(147);
		tv2.channelDown();
		System.out.println(tv2.getChannel());
		
		//tv 속성 값 변경
		//색상 변경
		//메소드 호출 시 void 인 경우 호출만 가능
		//리턴값이 없어서 syso 등에 넣지 못함
		tv2.setColor("black");
		System.out.println("tv color : "  + tv2.getColor());
		
		System.out.println(tv2.isPower());
		tv2.setPower(false);
		tv2.power();
		System.out.println(tv2.isPower());
		tv2.setPower(true);
		
		System.out.println(tv2.isPower());
	}

}
