package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123", "hong123@!", "hong123@!", "01012341234");
		Member member2 = new Member("hong123", "hong123@!", "hong123@!", "01012341234", "서울 종로구");

		// true 라면 비밀번호가 일치합니다, false라면 비밀번호를 확인해 주세요 출력
		System.out.println(member1.passwordAndConfirmPasswordEquals() == true ? "비밀번호가 일치합니다." : "비밀번호를 확인해주세요.");
		memberInfo(member1); // member1과 member2 내용 출력하기

		System.out.println();

		System.out.println(member2.passwordAndConfirmPasswordEquals() == true ? "비밀번호가 일치합니다." : "비밀번호를 확인해주세요.");
		memberInfo(member2); // member1과 member2 내용 출력하기

	}
	
	static void memberInfo(Member k) {
		if (k.password.equals(k.confirmPassword) == true)
			System.out.printf("아이디 : %s\n비밀번호 : %s\n전화번호 : %s\n주소 : %s\n", k.userId, k.password, k.hp, k.address);
	}

}
