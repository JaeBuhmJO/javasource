package collection;

/* 컬렉션 프레임워크
 * 여러 데이터들을 모아 놓은 것
 * framework : 표준화, 정형화된 프로그래밍 방식
 * 
 * 라이브러리 : 공통으로 사용될만한 유용한 기능을 모듈화
 * 
 * Collection interface <= 컬렉션 프레임워크 가 주로 지칭하는 것
 * 를 List interface와 Set interface가 상속받음
 * 그리고 따로 Map 이라는 interface가 있다. (컬렉션을 구성하지 않음)
 * 
 * Collection - map의 조상
 * Collections - 클래스, Collection에 사용되는 메소드들 가지고 있음
 * 
 * 1. List 인터페이스 : 순서가 존재함, 데이터 중복 허용
 * 	구현 클래스 : ArrayList, LinkedList, Stack, Queue, Vector, ...
 * collection.ListEx 참조
 * 
 * Stack : 수식계산, 수식 괄호 검사, 워드 undo/redo, 웹브라우저 뒤로 가기 앞으로 가기 등
 * Queue : 최근 사용문서, 인쇄작업 대기목록, 버퍼
 * 
 * List - ArrayList
 * <E> or <T>, <K,V> : generics - 타입 지정
 * E - element 타입 지정
 * K - key 타입, V - value 타입
 * 
 * 타입: 참조형 타입만 지정할 수 있다
 * add(), asList(), set(), remove(), get(), indexOf()
 * Collections.sort()
 * 
 * for Iterator - List, Set, Map 구조에서 요소에 접근하는 방법에 대한 *통일성* 제공
 * hasnext() - 다음 요소가 존재하면 true 리턴
 * next() - 다음 요소 가져오기
 * 
 * 배열과 List 동일한 개념
 * 배열은 크기를 변경할 수 없다(새로운 배열을 생성해서 데이터를 복사하는 작업이 필요함)
 * 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸림
 * => 순차적인 추가/삭제는 더 빠름. 비효율적인 메모리 사용
 * 
 * => 배열의 개선 - List(ArrayList 내부적으로는 배열의 동작방식과 동일함 - 효율은 개선X
 * 
 * List - LinkedList
 *  - ArrayList 단점을 보완
 * 인덱스로 강제 연결된 목록이 아니라, 한 요소가 다음 요소의 주소를 보유하고있는 형태
 *  => 목록의 중간부 수정 효율이 높음
 *  but 만약 데이터가 2000개라면, 1000번째 데이터만 접근할때도 1000단계의 주소이동이 필요함
 * => 데이터가 많을수록 접근성이 떨어짐
 * 
 * 2. Set 인터페이스 : 순서 없음, 데이터 중복 허용 안함
 * 	구현 클래스 : HashSet, TreeSet, ...
 * 자바가 제공하는 객체는 중복 자동으로 필터링함 Integer, String 등등
 * 하지만 사용자 정의 객체의 경우는 자동 중복 필터링되지 않음
 * 그를 허용하지 않으려면 별도의 코드 필요
 *  TreeSet
 *  - 이진탐색트리의 개념으로 데이터를 저장
 *  - 정렬, 검색, 범위검색에 높은 성능을 보이는 자료구조
 * 
 * 
 * Map 인터페이스 : (Key, value) 쌍으로 이루어진 데이터 집합
 * 				순서 없음, key는 중복 안되고 value는 중복 허용
 * 	구현 클래스 : HashMap, TreeMap, Hashtable, Properties, ...
 */

/* Arrays 클래스
 *  - 배열을 다루는 데 유용한 메서드가 정의되어있음
 *  - 모든 메서드는 static임
 *  toString(), copyOf(,), copyOfRange( , , ), fill(), sort()
 *  BinarySearch() : 검색
	 검색
	 순차검색 : 차례대로 검색하는 방식
	 이진검색 : 검색할 범위를 반복적으로 절반씩 줄여나가는 방식
		 1) 먼저 정렬이 되어있어야 함
		 2) 값을 찾는데 성공하면 요소의 index를 리턴
 */

/* 정렬
 * 
 * Arrays.sort
 * Collections.sort
 * 오름차순 / 공백 - 숫자 - 대문자 - 소문자
 * 
 * Comparable 인터페이스 : 기본 정렬 기준을 구현할 때
 *  1) compareTo(Object o)
 * 
 * Comparator 인터페이스 : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때
 *  .sort(T a[], Comparator<? super T> c) - 구현해서 Class 사용
 *  
 *  1) compare(Object o)
 *  
 *  
 */



public class A_note {

}
