package com.javaprojectsample.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaprojectsample.model.User;

public class UserSampleDaoImpl {
	
	public int userInsert(User user)
	{
		Connection con=ConnectionUtil.getDbConnect();
		
		String query="insert into UserSample123 values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"')";
		int num=0;
		Statement stmt;
		try {
			stmt = con.createStatement();
			
			num=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return num;
	}
	public int userDelete(String email)
	{
		Connection con=ConnectionUtil.getDbConnect();
		
		String query="delete from userSample123 where email='"+email+"'";
		int num=0;
		Statement stmt;
		try {
			stmt = con.createStatement();
			
			num=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return num;
	}
	public List<User> showAll()
	{
		List<User> userList=new ArrayList<User>();
		
		String query="select * from userSample123";
Connection con=ConnectionUtil.getDbConnect();
		Statement stmt;
		try {
			stmt = con.createStatement();
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				User user=new User(rs.getString(1), rs.getString(2), rs.getString(3));
				userList.add(user);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return userList;
		
	}
	

}
