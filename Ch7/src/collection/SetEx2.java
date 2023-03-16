package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println(set);
		
		//sort(List<T> list) : T는 Type / list 인터페이스 구현 객체여야함
//		Collections.sort(set); 그래서 지금은 컴파일 에러
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
	}

}
