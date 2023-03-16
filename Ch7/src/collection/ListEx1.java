package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임워크
 * 여러 데이터들을 모아 놓은 것
 * framework : 표준화, 정형화된 프로그래밍 방식
 * 
 * 라이브러리 : 공통으로 사용될만한 유용한 기능을 모듈화
 * 
 * Collection interface <= 컬렉션 프레임워크 가 주로 지칭하는 것
 * 를 List interface와 Set interface가 상속받음
 * 그리고 따로 Map 이라는 interface가 있다. (컬렉션을 구성하지 않음)
 * 
 * List 인터페이스 : 순서가 존재함, 데이터 중복 허용
 * 	구현 클래스 : ArrayList, LinkedList, Stack, Vector, ...
 * 
 * Set 인터페이스 : 순서 없음, 데이터 중복 허용 안함
 * 	구현 클래스 : HashSet, TreeSet, ...
 * 
 * Map 인터페이스 : (Key, value) 쌍으로 이루어진 데이터 집합
 * 				순서 없음, key는 중복 안되고 value는 중복 허용
 * 	구현 클래스 : HashMap, TreeMap, Hashtable, Properties, ...
 * 
 * <E> or <T>, <K,V> : generics - 타입 지정
 * E - element 타입 지정
 * K - key 타입, V - value 타입
 * 
 * 타입: 참조형 타입만 지정할 수 있다
 */

public class ListEx1 {
	public static void main(String[] args) {
		// List = 업그레이드 배열 느낌
		List<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		System.out.println(list1.size()); // length() 와 같은 기능
		System.out.println(list1.isEmpty());

		// add() : 요소 추가
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		list2.add("자바");
		list2.add("html");
		list2.add("script");
		list2.add("서블릿");

		System.out.println(list1);
		System.out.println(list2);

		String fruits[] = { "사과", "포도", "메론", "딸기", "바나나" };
		// 배열 -> 리스트로 변환(추가할 내용이 없다면)
		List<String> list3 = Arrays.asList(fruits);
//		asList 통해서 들어오면 배열의 성격을 가져오기 때문에 증칸은 안됨
//		list3.add("참외");
//		System.out.println(list3);

		// 배열 -> 리스트로 변환(추가할 내용이 있다면)
		List<String> list4 = new ArrayList<>(Arrays.asList(fruits));
		list4.add("참외"); // 이건 Exception 안난다. new ArrayList 때문에.
		System.out.println(list4);

		// add(int index, 요소)
		System.out.println(list1);
		list1.add(3, 6); // 6을 인덱스 3이 되는 위치에 add, 나머지 항목 뒤로 밀고
		System.out.println(list1);

		// set()
		list1.set(3, 7); // 인덱스 3인 자리의 원소를 7로 교체
		System.out.println(list1);

		// remove(int index) - 해당 인덱스 원소 삭제
		list2.remove(2); // 2번 인덱스 삭제됨
		System.out.println(list2);

		// remove(Object o) - 모든 클래스의 부모. 어떤 타입을 던져도 다 가능
		list4.remove("바나나"); // "바나나" 항목 삭제됨
		System.out.println(list4);

		list1.remove(2); // int는 항목보다 index 우선되어 제거됨
		System.out.println(list1);

		// get(int index) - index 위치 요소 가져오기
		System.out.println(list2);
		System.out.println(list2.get(1));

		// indexOf(Object o) - 특정 요소의 index 가져오기
		System.out.println(list2.indexOf("서블릿"));

		// 중간 add, remove가 로직이 알아서 해주긴 하지만, 과정은 Array와 동일
		// 해당 작업은 효율을 떨어트린다

		// Collections.sort() - 오름차순이 기본, 내림차순 원할때는 기준을 제공
		Collections.sort(list4);
		System.out.println("정렬 후 list4 : " + list4);

		list1.sort(Comparator.naturalOrder());
		System.out.println(list1);
		list1.sort(Comparator.reverseOrder());
		System.out.println(list1);

	}
}
