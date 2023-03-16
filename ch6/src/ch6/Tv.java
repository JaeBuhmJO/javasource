package ch6;
/* 변수, 연산자, 조건문, 반복문, 배열
 * 거의 모든 언어가 동일하게 활용함
 * 
 * 그렇다면 자바의 특징은? 객체지향 언어
 * 
 * 코드의 재사용성이 높다
 * 코드 관리가 용이
 * 신뢰성 높은 프로그래밍을 가능하게 함
 * 
 * 클래스 : 객체를 정의해 놓은 것
 * 클래스를 만드는 목적 : 객체를 생성하는 데 사용
 * => 자바의 기능 구현 등은 모두 클래스를 통해서/활용해서 하게 된다
 * 
 * 클래스는 메인이 없고, 실행해도 실행 안됨
 * 
 * 객체 : 사물 or 개념? 오브젝트
 */
public class Tv {
	//속성(property) ==> 멤버변수
	//변수 선언하듯이 선언하면 된다
	//: 크기, 길이, 높이, 색상, 볼륨, 채널...
	String color; //색상
	int channel; //채널
	boolean power; //전원상태
	
	//기능(function) ==> 메서드
	//: 켜기, 끄기, 볼륨 높이기, 볼륨 낯추기, 채널 변경...
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	//여기까지 상태로 run 해도, 직전 실행 main이 실행된다. main이 없으면 실행되지 않음
	
	
}
