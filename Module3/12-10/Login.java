package com.a1210;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener
{
		
		JFrame frame;
		JLabel email,pass_word,log;
		JTextField mob;
		
		JPasswordField pass;
		JButton login,close;
		
		public Login() {
			// TODO Auto-generated constructor stub
			frame=new JFrame();
			
			email=new JLabel("Enter your E-mail Address: ");
			email.setBounds(90, 73, 165, 13);
			frame.add(email);
			
			log=new JLabel("Login Page");
			log.setBounds(209, 30, 85, 13);
			frame.add(log);
			
			pass_word=new JLabel("Enter your password: ");
			pass_word.setBounds(90, 115, 145, 13);
			frame.add(pass_word);
			
			mob=new JTextField();
			mob.setBounds(253, 70, 150, 19);
			frame.add(mob);
			
			pass=new JPasswordField();
			pass.setBounds(253, 112, 150, 19);
			frame.add(pass);
			
			login=new JButton("Login");
			login.setBounds(235, 147, 85, 21);
			frame.add(login);
			
			login.addActionListener(this);

			close=new JButton("Close");
			close.setBounds(140, 147, 85, 21);
			frame.add(close);
			
			close.addActionListener(this);
			
			frame.setSize(500, 500);
			frame.setLayout(null);
			frame.setVisible(true);
			
}
		
class Details{

	public void loginDetail() {
				// TODO Auto-generated method stub

				login.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String host="jdbc:mysql://localhost:3306/";
						String db="information";
						String url=host+db;
						String iups,ips;
						
						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(url, "root","");
							
							String Email=mob.getText().toString();
							String Password=pass.getText().toString();
							
							String sql="Select email,password from Login_details where email='"+Email+"'";
							
							Statement stmt=con.createStatement();
							
							ResultSet set=stmt.executeQuery(sql);
							
							if(set.next()) {
								
								iups=set.getString(1);
								ips=set.getString(2);
								
								if(ips.equals(Password)) {
									JOptionPane.showMessageDialog(frame, "Login Sucessful");
									frame.setVisible(false);
								}
								else {
									JOptionPane.showMessageDialog(frame, "Wrong Password!\nLogin Unsucceessful");
								}
							}
							else {
								JOptionPane.showMessageDialog(frame, "No Email found email invalid");
							}
							
							
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();
						}
					}
			});
				
				
	}
	
	public void close() {
		close.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				}
			});
	}
			
}

	public static void main(String[] args) {
			new Login();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Details dt=new Details();
			
			if(e.getSource()==login) {
				dt.loginDetail();
			}
			if(e.getSource()==close) {
				dt.close();
			}
		}
	}



