package service;

import domain.ChangeDTO;
import persistence.MemberDAO;

public class MemberChangeService {
	public boolean change(ChangeDTO dto) {
		return new MemberDAO().change(dto);
	}
}
