package com.qhit.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class POIExcelDemo4 {

	public static void main(String[] args) throws Exception {
		String title = "用户表";
		String[] name = {"userid","cname","username","password"};
		//获取数据
		Connection connection = CommonUtil.getConnection();
		Statement statement = connection.createStatement();
		String sql = "select userid,cname,username,password from base_user";
		ResultSet rs = statement.executeQuery(sql);
		
		CommonUtil.exportExcel(title,name,rs);
		
	}
}
