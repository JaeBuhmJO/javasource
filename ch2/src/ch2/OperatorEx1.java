package ch2;

/*연산자
 * 1) 단항연산자
 * 		+(양수) , -(음수) , ++ , -- , ! , [~ 비트전환 과정중엔 안함]
 * 2) 이항연산자
 * 		산술 : +, -, *, /, %, [<<, >>, >>> 과정중엔 안씀]
 * 		비교 : > , < , >= , <= , ==(같은가?), =!(다른가?) -> true/false 출력
 * 		논리 : &&(and) , ||(or) , ^(xor - 서로 비트값이 다르면 1, 같으면 0 리턴), [&(and), |(or) 과정중엔 안씀]
 * 3) 삼항연산자
 * 		? :
 * 4) 대입연산자
 * 		= ex) int a = 4;
 * 
 * 연산자 우선순위
 * 5 + 3 * 4 -> 통상적인 산술 우선순위. 우선순위 부여는 ()
 */

public class OperatorEx1 {

	public static void main(String[] args) {

		// 단항연산자
		
		// ++, -- : 전위, 후위에 위치
		// 전위 : 값이 참조되기 전에 증가시킴 j = ++i;
		// 후위 : 값이 참조된 후 증가시킴 j = i++;
//		int i = 5;
//		i++; // i = i + 1;
//		System.out.println(i);
//
//		i = 5;
//		++i;
//		System.out.println(i);

		int i = 5, j = 0;
		j = i++; // 1. j = i; 2. i = i + 1; 서순
		System.out.println("j = i++ 실행 후 i = " + i + ", j = " + j);
		System.out.printf("j = i++ 실행 후 i = %d, j = %d\n", i, j);

		i = 5;
		j = 0;
		j = ++i; // 1. i = i + 1; 2. j = i;
		System.out.println("j = ++i 실행 후 i = " + i + ", j = " + j);
		System.out.printf("j = ++i 실행 후 i = %d, j = %d\n", i, j);

		// ! : true <-> false
		// 피연산자가 boolean 값을 가질때만 사용
		// !true, !false (O) , !3 (X)
		boolean play = true;
		System.out.println("play = " + play);
		System.out.println("!play = " + !play);

	}

}
