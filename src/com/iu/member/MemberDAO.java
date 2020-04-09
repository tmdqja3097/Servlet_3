package com.iu.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnect;

public class MemberDAO {
	
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		Connection con = DBConnect.getConnect();
		String sql = "select * from member where id=? and pw=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setPhone(rs.getString("phone"));
			memberDTO.setAge(rs.getInt("age"));
		}else {
			memberDTO = null;
		}			
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
	}
	
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		Connection con = DBConnect.getConnect();
		
		// 2. query문 작성
		String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
				
		// 3.sql 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		// 4. ? 세팅
		st.setString(1, memberDTO.getName());
		st.setString(2, memberDTO.getId());
		st.setString(3, memberDTO.getPw());
		st.setInt(4, memberDTO.getAge());
		st.setString(5, memberDTO.getPhone());
		st.setString(6, memberDTO.getEmail());
		
		// 5. 최종 전송 후 처리
		int result = st.executeUpdate();
				
		// 6. 자원 해제
		st.close();
		con.close();
				
		return result;
		
	}
	
}
