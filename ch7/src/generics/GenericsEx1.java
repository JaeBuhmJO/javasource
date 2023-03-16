package generics;

import java.util.ArrayList;

/* Generics
 * 컴파일 시 타입을 체크 해 주는 기능
 * 
 * 장점
 *  1) 타입 안정성 제공
 *  2) 타입 체크와 형 변환을 생략 할 수 있으므로 코드의 간결성 유지
 * 
 * <E>, <T>, <K,V>, <? extends T>, <? super T>, <?>
 */

public class GenericsEx1 {

	public static void main(String[] args) {
		//ArrayList<String> * : * 안에는 String만 담을 수 있음
		ArrayList<String> list = new ArrayList<>();
		Box1 box1 = new Box1();
		box1.setItem("홍길동");
		String item1 = (String)box1.getItem();
		System.out.println(item1);
		
		box1.setItem(1);
		int itemInt = (int)box1.getItem(); // object로 받은건 캐스팅이 귀찮음
		
		Box2<String> box2 = new Box2<>();
		box2.setItem("성춘향");
		String item2 = box2.getItem();
		System.out.println(item2);
	}

}
