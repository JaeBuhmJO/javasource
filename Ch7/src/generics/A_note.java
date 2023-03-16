package generics;

/* Generics
 * 컴파일 시 타입을 체크 해 주는 기능
 * 
 * 장점
 *  1) 지정 타입만 담아 타입 안정성 제공
 *  2) 타입 체크와 형 변환을 생략 할 수 있으므로 코드의 간결성 유지
 * 
 * <E>, <T>, <K,V>, <? extends T>, <? super T>, <?>
 * 
 * ArrayList<Product> tvList2 = new ArrayList<Tv>(); / 컴파일에러
 * 지네릭 인스턴스화 할 때 지네릭의 다형성은 인정 X, 왼쪽 오른쪽 <>동일해야함
 * 부모-자식 클래스 객체는 부모타입 선언 - 자식객체 담기 가능
 * <? extends Product> => Product 및 그 자손들 가능
 * <? super Product> => Product 및 그 조상들 가능
 * <?> => 와일드카드, 모든 타입 가능
 * 
 * 
 */

public class A_note {

}
