package ch6;

public class Tv4 {
	
	//private -> 외부 접근 불가
	//외부 : 해당 클래스 외 영역
	private String color; //색상
	private int channel; //채널
	private boolean power; //전원상태
	
	final int VOLUME = 10; // final : 상수 - 대문자로 표현
	//The blank final field VOLUME may not have been initialized
	//상수는 선언 시점에서 초기화를 같이 한다
	
	public Tv4(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
//		this.VOLUME = 15; //The final field Tv4.VOLUME cannot be assigned
	}
	
	public Tv4() {
		super();
	}

	void power() {
		power = !power;
	}
	
	int channelUp() {
		return ++channel;
	}

	void channelDown() {
		channel--;
	}
	
	// 마우스 우클릭 - Source - Generate Getters and Setters...
	// getter : 변수의 값을 리턴하는 형태
	public String getColor() {
		return color;
	}

	// setter : 변수의 값을 변경하는 형태
	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isPower() { // boolean 타입일때는 is
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
}
