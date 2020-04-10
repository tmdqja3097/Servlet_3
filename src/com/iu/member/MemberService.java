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
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		int result = memberDAO.memberDelete(memberDTO);
		return result;
	}
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		int result = memberDAO.memberUpdate(memberDTO);
		return result;
	}
}
