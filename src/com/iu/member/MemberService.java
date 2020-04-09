package com.iu.member;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		memberDAO = new MemberDAO();
	}
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.memberJoin(memberDTO);
		return result;
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
}
