package ch6;

public class TvEx1 {

	public static void main(String[] args) {
		//인스턴스화 => 클래스로부터 객체를 만드는 과정

		//Tv tv; : 객체 선언
		//tv = new Tv(); :객체 생성
		//스택에 있는 tv 에 heap주소가, heap 에 class Tv의 정보가 저장된다

		//Tv 객체 선언 + 생성 
		Tv tv = new Tv(); // 클래스이름 변수명 = new 클래스이름();
		printtv(tv); // 참조형태로 주소가 넘어감
		printtv(tv); // 참조형태로 주소가 넘어감
		
		//멤버변수 초기화 -> 객체 이름 뒤에 멤버변수명 / 이거 객체지향에서 안함
		tv.color = "black";
		tv.channel = 6;
		tv.power = true;
		printtv(tv);
		
		Tv tv2 = new Tv();
		tv2.color = "white";
		tv2.channel = 11;
		
		//메소드 호출
		tv2.power();
		printtv(tv2);
	}
	
	static void printtv(Tv v) {
		System.out.println("색상 "+v.color);
		System.out.println("채널 "+v.channel);
		System.out.println("전원여부 "+v.power);
	}
}
