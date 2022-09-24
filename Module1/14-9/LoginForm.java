import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginForm implements ActionListener
{
	
	JFrame frame;
	JLabel mobile,pass_word,log;
	JTextField mob;
	
	JPasswordField pass;
	JButton login,close;
	
	public LoginForm() {
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		mobile=new JLabel("Enter your mobile number: ");
		mobile.setBounds(90, 73, 165, 13);
		frame.add(mobile);
		
		log=new JLabel("Login Page");
		log.setBounds(209, 30, 85, 13);
		frame.add(log);
		
		pass_word=new JLabel("Enter your password: ");
		pass_word.setBounds(90, 115, 145, 13);
		frame.add(pass_word);
		
		mob=new JTextField();
		mob.setBounds(253, 70, 96, 19);
		frame.add(mob);
		
		pass=new JPasswordField();
		pass.setBounds(253, 112, 96, 19);
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
	public static void main(String[] args) {
		new LoginForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String number=mob.getText().toString();
		String password=pass.getText().toString();
		if(e.getSource()==login)
		{
			if(number.equals("9960089891")&&password.equals("tops"))
					{
				new Registration();
			}
			else {
				JOptionPane.showMessageDialog(frame, "Your Mobile number or Password is incorrect");
			}
		}
		
		if(e.getSource()==close) {
			frame.dispose();
		}
	}
}
