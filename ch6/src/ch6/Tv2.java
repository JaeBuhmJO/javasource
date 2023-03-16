package ch6;
/* 메소드 작성
 * 특정 작업을 수행하는 일련의 문장들을 하나로 묶어 놓은 것
 * 수학의 함수와 유사 - 펑션
 * 
 * 리턴(반환)타입 메소드명(){}
 * 리턴(반환)타입 메소드명(매개변수i,매개변수i2,...){}
 * (매개변수) = > (타입 변수명)
 * 
 * 리턴 타입 : void, 앞에서 사용했던 변수 타입 다 가능, 배열 가능
 * 
 */
public class Tv2 {
	String color; //색상
	int channel; //채널
	boolean power; //전원상태
	
	//리턴 타입 보이드 -> 메소드 실행 끝난 후 그냥 돌아감. 리턴 값 없음
	//메소드 이름 power
	//() {} 로 종료 => 메소드 완성
	void power() {
		power = !power;
	}
	
	//채널을 하나 증가하고, 현재 채널을 리턴
	//메소드가 호출되고 난 이후에 다시 원래 있던 곳으로 돌아감
	int channelUp() {
		channel++;
		return channel;
		//리턴타입 int-> 메소드가 실행이 끝난 후 int인 channel값을 가지고 돌아감
	}

	void channelDown() {
		channel--;
	}
	
	//여기까지 상태로 run 해도, 직전 실행 main이 실행된다. main이 없으면 실행되지 않음
	
	
}
