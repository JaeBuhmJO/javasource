package inheritance;
/* 하나의 클래스에 동일한 이름의 메소드나 생성자를 작성
 *  메소드 오버로딩, 생성자 오버로딩
 *  
 *  오버라이딩 : 상속
 *  부모가 가지고 있는 메소드와 동일한 시그니처를 가진 메소드를 자식도 가지고 있을 때
 *  시그니처 : 리턴타입, 메소드명, 매개변수 등
 *  부모가 제공하는 기능 + 확장의 개념이 있을 때
 *  혹은 기능을 덮어쓰기 할 때
 */
public class SubListString extends ListString{
	String name = "성춘향";
	
	@Override
	public void list() {
		super.list();
		System.out.println(name+"하위 클래스 이름");
	}
	
	public void writer() {
		System.out.println("하위 클래스 name 값"+name);
		System.out.println("상위 클래스 name 값"+super.name);
		//list() 호출 - SubListString, ListString
		list();
		super.list();
	}
	
	
	
}
