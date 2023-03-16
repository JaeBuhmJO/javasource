package generics;

import java.util.ArrayList;
import java.util.List;

/* 클래스 파일 하나에 여러 개의 클래스를 작성하는 것이 가능
 * 단, public 클래스는 하나만 존재해야 함
 */

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class GenericsEx2 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>();
//		지네릭 인스턴스화 할 때 지네릭의 다형성은 인정 X, 왼쪽 오른쪽 <>동일해야함
		ArrayList<? extends Product> tvList2 = new ArrayList<Tv>();
//		<? extends Product> => Product 및 그 자손들 가능
//		<? super Product> => Product 및 그 조상들 가능
		List<Tv> tvList3 = new ArrayList<>();

		// ArrayList<Product> : ArrayList 에 Product 타입만 추가하겠다
		// 부모-자식 클래스 객체는 부모타입 선언 - 자식객체 담기 가능
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());

		printAll(productList);
		
	}

	static void printAll(ArrayList<Product> productList) {
		for (Product product1 : productList) {
			System.out.println(product1);
		}
	}
}
