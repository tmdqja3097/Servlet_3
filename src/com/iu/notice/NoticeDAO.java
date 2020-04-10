package com.iu.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.point.PointDTO;
import com.iu.util.DBConnect;

public class NoticeDAO {

	public ArrayList<NoticeDTO> noticeList() throws Exception {

		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		// 1. DB연결
		Connection con = DBConnect.getConnect();
		// 2. SQL작성
		String sql = "select * from notice order by num desc";
		// 3. SQL 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		// 4. ? 세팅

		// 5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setName(rs.getString("name"));
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setSubject(rs.getString("subject"));
			noticeDTO.setHit(rs.getInt("hit"));
			noticeDTO.setToday(rs.getString("today"));
			noticeDTO.setContents(rs.getString("contents"));
			ar.add(noticeDTO);
		}
		// 6. 자원 해제
		rs.close();
		st.close();
		con.close();
		return ar;
	}

	public NoticeDTO noticeSelect(int num) throws Exception {

		NoticeDTO noticeDTO = null;
		Connection con = DBConnect.getConnect();
		String sql = "select * from notice where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);

		ResultSet rs = st.executeQuery();
		if (rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setSubject(rs.getString("subject"));
			noticeDTO.setName(rs.getString("name"));
			noticeDTO.setToday(rs.getString("today"));
			noticeDTO.setHit(rs.getInt("hit"));
			noticeDTO.setContents(rs.getString("contents"));
		}
		rs.close();
		st.close();
		con.close();

		return noticeDTO;
	}

	public int noticeAdd(NoticeDTO noticeDTO) throws Exception {

		Connection con = DBConnect.getConnect();
		String sql = "insert into notice values(seq_num.nextval,?,?,sysdate,0,?)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getSubject());
		st.setString(2, noticeDTO.getName());
		st.setString(3, noticeDTO.getContents());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}
	
	public int noticeMod(NoticeDTO noticeDTO) throws Exception{
		int result=0;
		Connection con = DBConnect.getConnect();
		String sql = "update notice set num=seq_num.nextval, subject=?,name=?,today=sysdate,hit=0,contents=? where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getSubject());
		st.setString(2, noticeDTO.getName());
		st.setString(3, noticeDTO.getContents());
		st.setInt(4, noticeDTO.getNum());
		
		System.out.println(noticeDTO.getSubject());
		System.out.println(noticeDTO.getName());
		System.out.println(noticeDTO.getContents());
		System.out.println(noticeDTO.getNum());
		result = st.executeUpdate();
		
		st.close();
		con.close();
		return result;
	}
}
