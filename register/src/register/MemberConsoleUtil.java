package register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {
	// 콘솔에 주어지는 화면들은 여기서 만들기

	public Member getNewmember(Scanner sc) {
		// 새로운 멤버 정보 입력받기
		System.out.print("id : ");
		String id = sc.nextLine();
		System.out.print("name : ");
		String name = sc.nextLine();
		System.out.print("address : ");
		String address = sc.nextLine();
		System.out.print("email : ");
		String email = sc.nextLine();
		System.out.print("age : ");
		int age = Integer.parseInt(sc.nextLine());

		Member newMember = new Member(id, name, address, email, age);

		return newMember;
	}

	public void printAddSuccessMessage(Member member) {
		System.out.println(member.getName() + "님 회원 정보 추가 성공");
	}

	public void printUpdateSuccessMessage(Member member) {
		System.out.println(member.getName() + "님 주소 정보 변경 성공");
	}

	public void printUpdateFailMessage() {
		System.out.println("회원 정보 변경에 실패했습니다.");
	}
	public void printRemoveSuccessMessage(Member member) {
		System.out.println(member.getName() + "님 회원 정보 삭제 성공");
	}
	
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제에 실패했습니다.");
	}

	public void printMemberList(ArrayList<Member> list) {
		System.out.println("아이디   이름   주소   이메일   나이");
		for (Member member : list) {
			System.out.printf("%s", member.getId());
			System.out.printf("%6s", member.getName());
			System.out.printf("%8s", member.getAddress());
			System.out.printf("%10s", member.getEmail());
			System.out.printf("%5d\n", member.getAge());
		}
	}

	public Member updateMember(Scanner sc, ArrayList<Member> list) {
		System.out.print("변경을 원하는 ID 입력 : ");
		String id = sc.nextLine();
		for (Iterator<Member> iterator = list.iterator(); iterator.hasNext();) {
			Member member = (Member) iterator.next();
			if (member.getId().equals(id)) {
				System.out.print("변경할 주소 입력 : ");
				member.setAddress(sc.nextLine());
				return member;
			}

		}

		System.out.println("존재하지 않는 ID입니다.");
		return null;
	}
	
	public Member removeMember(Scanner sc, ArrayList<Member>list) {
		System.out.print("삭제를 원하는 ID 입력 : ");
		String id = sc.nextLine();
		for (Iterator<Member> iterator = list.iterator(); iterator.hasNext();) {
			Member member = (Member) iterator.next();
			if (member.getId().equals(id)) {
				list.remove(member);
				System.out.println("ID가 삭제되었습니다");
				return member;
			}
			
		}
		System.out.println("존재하지 않는 ID입니다.");
		return null;
	}

}
