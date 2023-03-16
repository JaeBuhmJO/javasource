package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericsEx3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 1, 1));
		list.add(new Student("홍길서", 1, 2));
		list.add(new Student("홍길남", 1, 3));
		list.add(new Student("홍길북", 1, 4));

		// List, Set, Map 구조에서 요소에 접근하는 통일된 방법
		// 구조에 있는 엘리먼트 타입과 동일하게
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = /* (Student)지네릭 덕 생략가능 */ it.next();
			System.out.println(student.getName());
		}

		HashMap<String, Student> map = new HashMap<>();
		map.put("stu1", new Student("홍길동", 1, 1));
		map.put("stu2", new Student("홍길남", 1, 2));
		map.put("stu3", new Student("홍길서", 1, 3));
		map.put("stu4", new Student("홍길북", 1, 4));

	}
}
