package ch6;

public class Register {
	String userId;  // 아이디
	String password; // 비밀번호
	String mobile; // 핸드폰(필수 요소는 아님)
	
	public Register(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public Register(String userId, String password, String mobile) {
		this.userId = userId;
		this.password=password;
		this.mobile = mobile;
	}
	
}
