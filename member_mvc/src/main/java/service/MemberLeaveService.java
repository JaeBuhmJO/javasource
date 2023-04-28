package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberLeaveService {
	public boolean leave(MemberDTO dto) {
		return new MemberDAO().delete(dto);
	}
}
