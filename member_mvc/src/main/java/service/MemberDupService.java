package service;

import persistence.MemberDAO;

public class MemberDupService {
	public boolean duplicateId(String newid) {
		return new MemberDAO().duplicateId(newid);
	}
}
