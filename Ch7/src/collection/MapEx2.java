package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("자바1", 90);
		map.put("자바2", 100);
		map.put("자바3", 84);
		map.put("자바4", 60);
		map.put("자바5", 23);
		map.put("자바6", 7);

		// entrySet() : map -> set 구조로 변환 (map을 entry에 담았다가 set으로)
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);

		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			System.out.print("이름 : "+entry.getKey());
			System.out.println(" / 점수 : "+entry.getValue());
		}

		// keySet() : key 값만 가져오기
		System.out.println("키값 명단 : "+map.keySet());

		// values() : value 값만 가져오기
		System.out.println("밸류 목록 : "+map.values());
		Collection<Integer> values = map.values();
		// Collection - map의 조상
		// Collections - 클래스, Collection에 사용되는 메소드들 가지고 있음
		// 그러니까 Collections는 List, Set, Map에 사용되는 메소드들을 가지고 있음
		
		// 총점, 평균, 최고점, 최저점
		Iterator<Integer> it2 = values.iterator();
		int sum = 0;
		while (it2.hasNext()) {
			sum += it2.next();
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+sum/values.size());
		System.out.println("최고점 : "+Collections.max(values));
		System.out.println("최저점 : "+Collections.min(values));

	}

}
