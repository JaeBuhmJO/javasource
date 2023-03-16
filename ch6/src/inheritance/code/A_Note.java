package inheritance.code;

/* final
 * 무조건 변경 불가 키워드
 * 클래스에 final => 상속 금지
 * 멤버변수에 final = 상수 - 초기화 이후 값 변경 불가능
 * 메소드에 final = > 오버라이딩 금지
 * 지역변수에 final = 상수
 */

/* class는 대부분 public으로 설정한다. - 서로 패키지가 다른 경우가 많기 때문
 * method는 대부분 public으로 설정한다. 활용을 위해서
 * 멤버변수는 거의 무조건 private으로 설정한다.
 *  - 캡슐화를 통해서 외부로부터 데이터를 보호, 내부 논리 감추기 위해서
 * 메소드를 통해 멤버변수에 접근하면 값을 검사하고 통제 가능함
 * 
 * 컴파일 오류 - 문법이 잘못된 경우 - IDE가 대부분 검증
 * 런타임 오류 - 문법은 맞으나 값/논리에서 오류가 발생한 경우
 * 
 * String string = new String("Hello"); 
 *  => String str = "Hello";
 * 스트링만, 사용빈도 너무 높아 축약 가능
 */

/*static 에서 non static 메소드 호출하기
 * 1. 메소드를 static 으로 변경한다
 * 2. 인스턴스화 하고 객체를 통해서 접근
 * 
 * static 변수/메소드 등 호출 : 어디서 호출하든 class명.변수/메소드명
 */

/* import문
 * 다른 패키지에 있는 클래스를 사용할 때 필요
 */

/* 접근 제어자(modifier) : 
 * 멤버 또는 클래스에 사용되어 해당 멤버 또는 클래스를 외부에서 접근 못하도록 제한
 * 접근 제어자가 사용되는 곳 : 클래스, 멤버변수, 메서드, 생성자
 * 접근 범위 : public > protected > default > private
 * 
 * public - 접근 제한되지 않음 : 주로 메소드, 클래스
 * protected - 같은 패키지 내 + 다른 패키지의 자손 클래스에서 접근 가능
 * default - 같은 패키지 내에서만 접근 가능. 일반적으로 입력은 생략. 
 * private - 같은 클래스 내에서만 접근 가능 : 주로 속성(멤버변수)
 * 
 * 제어자
 * static(공통적인) - 멤버변수, 메서드, 초기화블럭
 * final - 클래스, 메서드, 멤버변수, 지역변수
 * static final - 공통 상수
 * 
 * abstract - 추상클래스
 */

public class A_Note {

}
