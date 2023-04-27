package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberLoginService {
	public MemberDTO login(String userid, String password) {
		return new MemberDAO().isLogin(userid, password);
	}
}
