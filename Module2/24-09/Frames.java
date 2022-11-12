import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frames implements ActionListener
{
	JFrame frame;
	JLabel jl1,jl2;
	JTextField jt1;
	JPasswordField jt2;
	JButton jb1;
	
	public Frames() {
		frame = new JFrame("Login App");
		
		jl1 = new JLabel("Enter your mobile number:");
		jl1.setBounds(112, 88, 175, 13);
		
		jl2= new JLabel("Enter your password:");
		jl2.setBounds(112, 122, 175, 13);
		
		jt1= new JTextField();
		jt1.setBounds(295, 85, 96, 19);
		
		jt2 = new JPasswordField();
		jt2.setBounds(295, 119, 96, 19);
		
		jb1= new JButton("Login");
		jb1.setBounds(151, 148, 85, 21);
		
		jb1.addActionListener(this);
	
		frame.add(jl1);
		frame.add(jl2);
		frame.add(jt1);
		frame.add(jt2);
		frame.add(jb1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);

	}
	public static void main(String[] args) {
		new Frames();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String num=jt1.getText().toString();
		String pass=jt2.getText().toString();
		String value="The number is "+num+" "+"\n The passpord is "+pass;
		
		if(e.getSource()==jb1) {
			try {
				FileOutputStream fout = new FileOutputStream("E://LoginInfo.txt");
				//ObjectOutputStream out=new ObjectOutputStream(fout);
				//out.writeObject(value);
				String number="Your number is :";
				//System.out.println(number.getBytes());
				fout.write(number.getBytes());
				fout.write(num.getBytes());
				System.out.println();
				String password="\n Your password is :";
				//System.out.println(password.getBytes());
				fout.write(password.getBytes());
				fout.write(pass.getBytes());
				System.out.println("Sucess");
			} catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
		}
		
	}
}
