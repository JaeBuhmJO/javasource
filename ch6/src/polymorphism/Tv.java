package polymorphism;

/* 다형성 polymorphism
 * 여러가지 형태를 가질 수 있는 능력
 * 상속일때만 가능
 * '하나의 참조 변수'로 "여러 타입의 객체"를 참조할 수 있는 것
 * '조상 타입의 참조 변수'로 "자손 타입의 객체"를 다룰 수 있는 것
 */

public class Tv {
	String color; 
	int channel; 
	boolean power; 
	
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
