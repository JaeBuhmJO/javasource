package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			set.add(String.valueOf(i)); // i를 String 형태로 받기
		}

		System.out.println(set);
		set.add("9");
		System.out.println(set); // 결과는 같다, 중복값 허용 x

		Iterator<String> it = set.iterator(); // set을 이터레이터를 통해 it으로
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		//순서 보장된거 아니기때문에 순차적으로 나온거 아님. 순서는 없는 인터페이스

	}

}
