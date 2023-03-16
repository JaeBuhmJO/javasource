package ch1;

public class VariableEx9 {

	public static void main(String[] args) {

		// 변수의 범위 : 지역변수, 인스턴스 변수, 클래스 변수 모든 변수는 유효범위 존재

		int i = 4;
		// i 의 유효범위? 자기가 포함된 {} 안에서만 효력을 갖는다 : 지역변수. 같은 지역 안에서 선언을 또 할 수는 없다.

		{
			int j = 5;
			System.out.println(j);
		}
		// System.out.println(j); cannot be resolved to a variable - 유효범위 밖 j
		System.out.println(i);
		
	}
}
