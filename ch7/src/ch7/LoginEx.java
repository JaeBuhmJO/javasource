package ch7;

import java.util.Scanner;

/* Exception 클래스를 상속받아서 NotExistIdException,
 * WrongPasswordException 작성
 */

public class LoginEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("id를 입력해주세요 : ");
		String id_Input = scanner.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pwd_Input = scanner.nextLine();
		
		try {
			login(id_Input,pwd_Input);
		} catch (NotExistIdException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scanner.close();
	}

	public static void login(String id, String pwd) throws NotExistIdException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIdException("id가 일치하지 않습니다");
		}
		if (!pwd.equals("12345")) {
			throw new WrongPasswordException("비밀번호를 확인해주세요");
		}
		System.out.println("로그인 성공");
		
	}
	
	

}
