
package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Model;


public class UserDao 
{
	public static Connection getConnect() 
	{
		Connection con=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_crud","root","");
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static int SaveData(Model m) 
	{
		int status=0;
		
		Connection con=UserDao.getConnect();
		
		try 
		{
			PreparedStatement ps=con.prepareStatement("insert into info (first_name,last_name,email,password) values(?,?,?,?)");
			ps.setString(1, m.getFirst_name());
			ps.setString(2, m.getLast_name());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPassword());
			
			status=ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	public static List<Model>viewData()
	{
		List<Model>list=new ArrayList<Model>();
		Connection con=UserDao.getConnect();
		
		try 
		{
			PreparedStatement ps=con.prepareStatement("select * from info");
			ResultSet set=ps.executeQuery();
			
			while(set.next()) 
			{
				Model m=new Model();
				m.setId(set.getInt(1));
				m.setFirst_name(set.getString(2));
				m.setLast_name(set.getString(3));
				m.setEmail(set.getString(4));
				m.setPassword(set.getString(5));
				
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
	
	public static int deleteData(int id)
	{
		int status=0;
		Connection con=UserDao.getConnect();
		try
		{
			PreparedStatement ps=con.prepareStatement("delete from info where id=?");
			ps.setInt(1, id);
			
			status=ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Model getElementById(int id) 
	{
		Model m=new Model();
		Connection con=UserDao.getConnect();
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			PreparedStatement ps=con.prepareStatement("select * from info where id=?");
			ps.setInt(1, id);
			ResultSet set=ps.executeQuery();
			
			if(set.next()) 
			{
				int id2 =set.getInt(1);
				String first_name =set.getString(2);
				String last_name =set.getString(3);
				String email =set.getString(4);
				String password = set.getString(5);
			
				
				m.setId(id2);
				m.setFirst_name(first_name);
				m.setLast_name(last_name);
				m.setEmail(email);
				m.setPassword(password);
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
		
		
	}
	
	public static int Updatedata(Model m)
	{
		int status =0;
		
		Connection con =UserDao.getConnect();
		
		String sql ="update info set first_name =? , last_name =?,email =?, password =? where id =?";
		try 
		{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1,m.getFirst_name());
			ps.setString(2,m.getLast_name());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getPassword());
			ps.setInt(5, m.getId());
			status = ps.executeUpdate();
		
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	
	}
}
