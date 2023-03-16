package ch6;

public class Member {
	String userId;
	String password;
	String confirmPassword;
	String hp;
	String address;

	public Member(String userId, String password, String confirmPassword, String hp, String address) {
		super();
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}

	public Member(String userId, String password, String confirmPassword, String hp) {
		super();
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}

	boolean passwordAndConfirmPasswordEquals() {
		return password.equals(confirmPassword);
	}
	
}
