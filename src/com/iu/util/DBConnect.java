package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static void main(String[] args){
		try {
			Connection con = DBConnect.getConnect();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnect() throws Exception {
		// 1. 로그인 정보 4가지
		String user = "user04";
		String password = "user04";
		String url = "jdbc:oracle:thin:@211.238.142.227:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver1";
				
		// 2. Driver를 메모리에 로딩
		Class.forName(driver);
		
		// 3. Login Connection 객체 반환
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
}
