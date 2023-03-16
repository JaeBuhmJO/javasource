package generics;

//지네릭 클래스, T Box2 라고 읽는다
//Box2 - 원시타입 - 기본타입

public class Box2<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
