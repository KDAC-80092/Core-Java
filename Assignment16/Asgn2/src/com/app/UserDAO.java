package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public class UserDAO implements AutoCloseable
{

	
	private Connection con;
	
	public UserDAO() throws SQLException
	{
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception 
	{
		try
		{
			if(con != null)
				con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static String dateToString(java.util.Date d)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String str = sdf.format(d.getTime());
		return str;
	}
	
	
	// add new 
	
	public int addUser(User u) throws SQLException, ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(u.getDob());
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		
		String sql = "INSERT INTO users VALUES(default,?,?,?,?,?,true,'voter')";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
//			String dob;
//			boolean sts;
//			String rol;
			stmt.setString(1, u.getFname());
			stmt.setString(2, u.getLname());
			stmt.setString(3, u.getMail());
			stmt.setString(4, u.getPasswrd());
			stmt.setDate(5, sDate);
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
	}
	
	public int updateUser(User u) throws SQLException
	{
		String sql = "UPDATE users SET first_name = ?,last_name = ? WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setString(1, u.getFname());
			stmt.setString(2, u.getLname());
			stmt.setInt(3, u.getId());
			
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
		
		
	}
	
	public int deleteUser(int id) throws Exception
	{
		String sql = "DELETE FROM users WHERE id = ?";
		try( PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
				
	}
	
	public List<User> displayAll() throws Exception
	{
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			try(ResultSet rs = stmt.executeQuery())
			{
				while(rs.next())
				{
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String mail = rs.getString("email");
					boolean stats = rs.getBoolean("status");
					String pass = rs.getString("password");
					java.sql.Date date = rs.getDate("dob");
//					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//					String sDate = sdf.format(date);
					String sDate = dateToString(date);
					String rol = rs.getString("role");
					User u = new User(id,fname,lname,mail,pass,sDate,stats,rol);
					
					
					list.add(u);
				}
			}
		}
		return list;
		
	}
	
	
	
}
