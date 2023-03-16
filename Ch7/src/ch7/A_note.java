package ch7;

/* 컴파일 에러 : 컴파일 시에 발생하는 에러 - 컴파일러가 체크해주는 Exception
 * 런타임 에러 : 실행 시에 발생하는 에러 - IDE 컴파일 에러 없는데 돌렸더니 에러
 * 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것
 * 
 * 에러(error) : 코드에 의해서 수습될 수 없는 심각한 오류 ex)메모리 부족, 스택 오버플로우
 * 예외(exception) : 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * 
 * Exception - 상속의 개념이 들어가있음
 *  1) Exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 *  2) RuntimeException 클래스들 : 프로그래머의 실수로 발생하는 예외
 *  	- 배열 범위 벗어나기, NullPointerException, ClassCastException..
 * 
 *  % Exception 처리
 *  1) try - catch 문
 * try 에 예외가 발생 가능한 코드 - catch에 예외가 발생시 동작할 코드
 * catch는 여러개 만들 수 있다 : 자식->부모 순으로 오류형태를 지정해야함
 * e.printStackTrace(); // 개발 과정에서 많이 쓰는 코드
 *  - 예외가 발생하는 구문을 추적해서 출력) - 예외가 있어도 다음코드 진행
 *  
 * 		1-1) try - catch - finally 문 // try - finally
 *		예외와 상관없이 항상 수행되어야 하는 구문 finally에 작성
 * 
 *  2) 예외 던지기 : main 메소드를 호출하는 곳(JVM)에서 처리
 * throw - 강제 예외발생 // throws - 예외 던지기
 * Exception 클래스 - 컴파일시 예외 발생으로 처리
 * RuntimeException 클래스 - 실행시 예외
 * 
 */

public class A_note {

}
