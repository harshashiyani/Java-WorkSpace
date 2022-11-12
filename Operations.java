package coma1510;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Operations {
	
	String host="jdbc:mysql://localhost:3306/";
	String db="information";
	String url=host+db;
	
	JFrame registerframe,loginframe;
	JTextField Uname,Fname,Email;
	JPasswordField pass;
	JLabel  Un, Fn, Em, Ps, Er;
	JButton Log, Sig;
	
	public void register() {
		// TODO Auto-generated method stub
		registerframe = new JFrame();
		registerframe.setLayout(null);
		registerframe.setVisible(true);
		registerframe.setSize(500, 500);
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		registerframe.add(Un);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		registerframe.add(Ps);
		
		Fn = new JLabel("Full Name");
		Fn.setBounds(44, 107, 70, 17);
		registerframe.add(Fn);
		
		Em = new JLabel("Email Id");
		Em.setBounds(44, 145, 70, 17);
		registerframe.add(Em);
		
		Uname = new JTextField();
		Uname.setBounds(115, 22, 195, 20);
		registerframe.add(Uname);
		
		pass = new JPasswordField();
		pass.setBounds(115, 64, 195, 20);
		registerframe.add(pass);
		
		Fname = new JTextField();
		Fname.setBounds(115, 104, 195, 20);
		registerframe.add(Fname);
		
		Email = new JTextField();
		Email.setBounds(115, 142, 195, 20);
		registerframe.add(Email);
		
		
		Sig = new JButton("Sign Up");
		Sig.setBounds(115, 188, 89, 23);
		registerframe.add(Sig);
		
		Sig.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String uname=Uname.getText().toString();
				String fname=Fname.getText().toString();
				String email=Email.getText().toString();
				String password=pass.getText().toString();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,"root","");
					
					String sql="insert into register values(null,'"+uname+"','"+fname+"','"+email+"','"+password+"')";
					
					Statement stmt= con.createStatement();
					
					int status =((java.sql.Statement) stmt).executeUpdate(sql);
					
					if(status>0)
					{
						registerframe.setVisible(false);
					}
					else
					{
						registerframe.setVisible(true);
					}
				} 
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
		});
	}
	
	public void login() {
		
		loginframe = new JFrame();
		loginframe.setLayout(null);
		loginframe.setVisible(true);
		loginframe.setSize(500, 500);
		
		String iun,ips;
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		loginframe.add(Un);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		loginframe.add(Ps);
		
		Uname = new JTextField();
		Uname.setBounds(115, 22, 195, 20);
		loginframe.add(Uname);
		
		pass = new JPasswordField();
		pass.setBounds(115, 64, 195, 20);
		loginframe.add(pass);
		
		Log = new JButton("Sign In");
		Log.setBounds(115, 128, 89, 23);
		loginframe.add(Log);
		
		Log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String iun,ips;
				
				String name=Uname.getText().toString();
				String pass1=pass.getText().toString();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url,"root","");
					
					String sql="select u_name,pass from register where u_name='"+name+"' ";
					
					Statement stmt= con.createStatement();
					
					ResultSet set= stmt.executeQuery(sql);
					
					
					if(set.next()) {
						
						iun=set.getString(1);
						ips=set.getString(2);
						
						if(ips.equals(pass1)) {
							JOptionPane.showMessageDialog(loginframe, "Login Sucessfully");
							loginframe.setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(loginframe, "You Password is Wrong\nLogin Unsucessfull");
						}
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
	
}
