package com.iu.notice;

import java.util.ArrayList;

import com.iu.point.PointDAO;
import com.iu.point.PointDTO;

public class NoticeService {

	private NoticeDAO noticeDAO;

	public NoticeService() {
		this.noticeDAO = new NoticeDAO();
	}

	public ArrayList<NoticeDTO> noticeList() throws Exception {
		return noticeDAO.noticeList();
	}

	public NoticeDTO noticeSelect(int num) throws Exception {
		return noticeDAO.noticeSelect(num);
	}
	
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception {
		int result = noticeDAO.noticeAdd(noticeDTO);
		return result;
	}
	public int noticeMod(NoticeDTO noticeDTO) throws Exception{
		int result = noticeDAO.noticeMod(noticeDTO);
		return result;
	}
}
