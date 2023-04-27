package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberRegisterService {
	public boolean register(MemberDTO dto) {
		return new MemberDAO().register(dto);
	}
}
