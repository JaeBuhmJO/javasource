package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

	public static void main(String[] args) {
		// ArrayList에 Member 객체를 추가
		ArrayList<Member1> list1 = new ArrayList<>();// 기본생성자 10공간
		System.out.println(list1);
		list1.add(new Member1("홍길동"));
		System.out.println(list1);
		list1.add(new Member1("홍길서"));
		list1.add(new Member1("홍길남"));
		list1.add(new Member1("홍길북"));
		System.out.println(list1);
		System.out.println();

		ArrayList<Member2> list2 = new ArrayList<>();
		list2.add(new Member2("홍길동", "hkd123", "hkd1234"));
		list2.add(new Member2("고길동", "kkd123", "kkd1234"));
		list2.add(new Member2("성춘향", "sch123", "sch1234"));
		list2.add(new Member2("강감찬", "kkc123", "kkc1234"));
		list2.add(new Member2("송혜교", "shk123", "shk1234"));

		System.out.println(list2); // 잘 됐는지 확인용

		for (int i = 0; i < list2.size(); i++) {
			Member2 member = list2.get(i);
			System.out.println(
					"id : " + member.getId() + " password : " + member.getPassword() + " name : " + member.getName());
		}

		//for Iterator - List, Set, Map 구조에서 요소에 접근하는 방법에 대한 *통일성* 제공
		//hasnext() - 다음 요소가 존재하면 true 리턴
		//next() - 다음 요소 가져오기
		System.out.println();
		System.out.println("id\t\tpassword\tname");
		System.out.println("=====================================");
		for (Iterator<Member2> iterator = list2.iterator(); iterator.hasNext();) {
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t\t"+member2.getPassword()+"\t\t"+member2.getName());
		}

		System.out.println();
		System.out.println("id\t\tpassword\tname");
		System.out.println("=====================================");
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t\t"+member2.getPassword()+"\t\t"+member2.getName());
		}

	}

}
