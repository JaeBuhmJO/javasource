package ch2;

/*삼항연산자 - 조건 ? true시 리턴 : false시 리턴
 * 두 수를 비교해서 앞의 수가 크면 앞의 수를 변수에 담고
 * 뒤의 수가 크면 뒤의 수를 변수에 담기
 * 5 > 3 ? 5 : 3
 * x > y ? x : y
 */

public class OperatorEx4 {

	public static void main(String[] args) {

		int x = 5, y = 10;
		int max = x > y ? x : y;
		System.out.println(max);

	}

}
