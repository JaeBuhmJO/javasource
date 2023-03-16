package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		//person 객체를 set 구조에 담기
		Set<Person> set = new HashSet</*여기가 앞의 Person과 같아서 생략가능*/>();
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		//자바가 제공하는 객체는 중복 자동으로 필터링함 Integer, String 등등
		//하지만 사용자 정의 객체의 경우는 자동 중복 필터링되지 않음
		//그를 허용하지 않으려면 별도의 코드 필요
		System.out.println(set);
		//Person 클래스에서 hashcode and equals 오버라이딩시 사용자 정의 객체도 필터가능
		
	}

}
