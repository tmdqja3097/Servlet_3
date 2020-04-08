package com.iu.point;

import java.util.ArrayList;

public class PointService {
	
	private PointDAO pointDAO;
	
	public PointService() {
		this.pointDAO = new PointDAO();
	}
	// 1. List
	public ArrayList<PointDTO> PointList() throws Exception{
		return pointDAO.pointList();
	}
	
	public PointDTO pointSelect(int num) throws Exception{
		
		return pointDAO.pointSelect(num);
	}
	
	public int pointDelete(int num) throws Exception{
		return pointDAO.pointDelete(num);
	}
	
	public int pointAdd(PointDTO pointDTO) throws Exception {
		pointDTO.setTotal(pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath());
		pointDTO.setAvg(pointDTO.getTotal()/3.0);
		int result = pointDAO.pointAdd(pointDTO);
		
		return result;
	}
}
