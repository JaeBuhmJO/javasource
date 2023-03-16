package inheritance;

//this - 자기 자신 클래스를 지칭
//this() : 생성자에서 다른 생성자를 호출 시 
//this.변수명 : 매개 변수와 생성자용 인스턴스변수 이름이 같을 때 구별 용도

//super - 부모 클래스를 지칭
//super() : 생성자에서 부모 생성자를 호출 시
//super.변수명 : 부모가 가지고 있는 인스턴스 변수를 사용할 때

//클래스 작성시 부모를 지정하지 않으면 Object 라는 클래스가 최상위로 지정됨
public class Tv2 {
	boolean power;
	int channel;

public Tv2(boolean power, int channel) {
		super();
		this.power = power;
		this.channel = channel;
	}

//	public Tv2() {
//		super(); //부모의 기본 생성자 호출. 
//		기본생성자는 막을 수 있어도, super는 지워도 주석처리해도 무조건 돈다
//	}

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

}
