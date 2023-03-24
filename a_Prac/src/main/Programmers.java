package main;

import java.util.HashMap;
import java.util.Map;

public class Programmers {
	public static void main(String[] args) {

		Solution1 solution = new Solution1();
		String s = "banana";

		System.out.println(solution.solution(s));
	}
}

class Solution1 {
	public int solution(String s) {
		int answer = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			map.putIfAbsent(s.charAt(i),1);
			
		}
		//글자별로 매핑시키고, +1로 시작해서 다른게 나오면 -1 같은거 나오면 +1
		//값이 0이 되면 분해카운트 +1

		return answer;
	}
}