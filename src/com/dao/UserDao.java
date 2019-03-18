package com.dao;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBUtil;
import com.servlet.User;
public class UserDao {
	public User query(String userName)throws SQLException{
		User user=null;
		Connection conn=DBUtil.getConnection();
		String sql="select user_name,password from userList where user_name=?";
		PreparedStatement pStmt=conn.prepareStatement(sql);
		pStmt.setString(1, userName);
		ResultSet rs=pStmt.executeQuery();
		while(rs.next()){
			user=new User();
			user.setUsername(rs.getString("user_name"));
			user.setPassword(rs.getString("password"));
		}
		return user;
		
	}
	public void add(String username,String password)throws SQLException{
		Connection conn=DBUtil.getConnection();
		String sql="Insert into userList (user_name,password) Values(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		pstmt.executeUpdate();
	}

}
