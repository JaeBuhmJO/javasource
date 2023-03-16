package lang;

public class StringEx4 {

	public static void main(String[] args) {
		String names[] = { "Queen", "Tod", "Park", "Kim", "Hong" };
		System.out.println(findKim(names));
		// 김씨성은 4번째에 있다

	}

	public static String findKim(String[] seoul) {
		int order = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				order = i + 1;
			}
		}

		return "김씨 성은 " + order + "번째에 있다";
	}

}
