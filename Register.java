package coma1510;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Register implements ActionListener{
	JFrame frame;
	JLabel welcome;
	JButton login,reg;
	
	public Register() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		welcome = new JLabel("WELCOME");
		welcome.setBounds(166, 11, 111, 38);
		frame.add(welcome);
		
		login = new JButton("Sign In");
		login.setBounds(144, 55, 101, 38);
		login.addActionListener((ActionListener) this);
		frame.add(login);
		
		reg = new JButton("Sign Up");
		reg.setBounds(144, 125, 101, 38);
		reg.addActionListener((ActionListener) this);
		frame.add(reg);
	}
	
	public static void main(String[] args) {
		new Register();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Operations os= new Operations();
		if(e.getSource()==login) {
			os.login();
		}
		if(e.getSource()==reg) {
			os.register();
		}
		
	}
	
	
	

}
