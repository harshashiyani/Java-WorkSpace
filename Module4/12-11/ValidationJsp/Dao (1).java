package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;

public class Dao 
{
	public static  Connection connect() {
		
		Connection con=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Module","root","");
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	public static int savedata(Model m) 
	{
		int status=0;
		
		
			
		
		Connection con=Dao.connect();
		try 
		{
			
			PreparedStatement ps=con.prepareStatement("insert into signup(Name,Surname,Email,Mobile,Gender,Pass)values(?,?,?,?,?,?)");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4, m.getMobile());
			ps.setString(5,m.getGender());
			ps.setString(6, m.getPass());
			
			status= ps.executeUpdate();
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	public static List<Model> viewdata()
	{
		List<Model> list=new ArrayList();
		Connection con=Dao.connect();
		try 
		{
			
			PreparedStatement ps=con.prepareStatement("select * from signup");
			ResultSet set=ps.executeQuery();
			while(set.next()) 
			{
				Model m=new Model();
				m.setId(set.getInt(1));
				m.setFname(set.getString(2));
				m.setLname(set.getString(3));
				m.setEmail(set.getString(4));
				m.setMobile(set.getString(5));
				m.setGender(set.getString(6));
				m.setPass(set.getString(7));
				
				list.add(m);
				
			}
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
