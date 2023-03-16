package generics;

import java.util.ArrayList;

//지네릭 클래스, T Box2 라고 읽는다
//Box2 - 원시타입 - 기본타입

public class Box3<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return "Box3 [list=" + list + "]";
	}
	
}
