package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Map
 * 키(key) : 유일값
 * 값(value) : 중복 가능
 * 
 */

public class MapEx1 {

	public static void main(String[] args) {
		// K = key에 들어갈 타입, V = value에 들어갈 타입
		Map<String, String> map = new HashMap<>();
	
		//put() : 요소 추가
		map.put("myId1", "1234");
		map.put("myId2", "2345");
		map.put("myId3", "3456");
		map.put("myId4", "4567");

		//키 값이 동일하다면 마지막 키값-밸류만 저장. 덮어쓰기
		System.out.println(map);
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Id 입력 : ");
			String idInput = scanner.nextLine().trim();
			System.out.print("Password 입력 : ");
			String pwInput = scanner.nextLine().trim();
			if (map.containsKey(idInput)) {
				if (map.get(idInput).equals(pwInput)) {
					System.out.println("로그인 성공");
					scanner.close();
					System.exit(0);
				}else {
					System.out.println("다시 입력해주세요");
				}
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요");
			}
		}
	}

}
