package collection;

import java.util.LinkedList;

/* 배열과 List 동일한 개념
 * 배열은 크기를 변경할 수 없다(새로운 배열을 생성해서 데이터를 복사하는 작업이 필요함)
 * 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸림
 * 
 * => 배열의 개선 - List(ArrayList 내부적으로는 배열의 동작방식과 동일함 - 효율은 개선X
 * 
 * LinkedList
 *  - ArrayList 단점을 보완
 * 인덱스로 강제 연결된 목록이 아니라, 한 요소가 다음 요소의 주소를 보유하고있는 형태
 *  => 목록의 중간부 수정 효율이 높음
 * but 만약 데이터가 2000개라면, 1000번째 데이터만 접근할때도 1000단계의 주소이동이 필요함
 * 
 */

public class ListEx3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("자몽");
		list.add("귤");
		list.add("수박");
		list.add("딸기");
		list.add("망고스틴");
		list.add("두리안");
		list.add("배");
		
		for (String fruit : list) {
			System.out.print(fruit+" ");
		}
		
	}

}
