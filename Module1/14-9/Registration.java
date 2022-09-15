import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Registration implements ActionListener, ItemListener
{
	
	JFrame frame;
	JLabel f1,l1,urname,pass,repass,dob,add,city,gender,course,lbl1,lbl2,lbl3;
	JButton con;
	JTextField fast,last,user;
	JPasswordField password,rpword;
	JTextArea address;
	JComboBox city1;
	JDateChooser BOD;
	JRadioButton male,female;
	JCheckBox java,python,php,dotnet;
	String cities[]= {"Surat","Rajkot","Mumbai","Pune"};
	
	
	public Registration() {
		// TODO Auto-generated constructor stub
		frame=new JFrame();
		
		f1=new JLabel("First Name :");
		f1.setBounds(68, 64, 75, 13);
		frame.add(f1);
		
		l1=new JLabel("Last Name :");
		l1.setBounds(286, 64, 75, 13);
		frame.add(l1);
		
		urname=new JLabel("User Name :");
		urname.setBounds(68, 86, 75, 13);
		frame.add(urname);
		
		pass=new JLabel("Password :");
		pass.setBounds(68, 109, 75, 13);
		frame.add(pass);
		
		repass=new JLabel("ReEnter Pass :");
		repass.setBounds(48, 132, 95, 13);
		frame.add(repass);
		
		dob=new JLabel("BirthDate :");
		dob.setBounds(68, 155, 75, 13);
		frame.add(dob);
		
		add=new JLabel("Address :");
		add.setBounds(68, 178, 75, 13);
		frame.add(add);
		
		city=new JLabel("City"); 	
		city.setBounds(286, 178, 75, 13);
		frame.add(city);
		
		gender=new JLabel("Gender : ");
		gender.setBounds(68, 219, 75, 13);
		frame.add(gender);
		
		course=new JLabel("Course : ");
		course.setBounds(68, 242, 75, 13);
		frame.add(course);
		
		lbl1=new JLabel("Registration Form");
		lbl1.setBounds(211, 26, 115, 13);
		frame.add(lbl1);
		
		lbl2=new JLabel("Already have an account?");
		lbl2.setBounds(111, 341, 155, 13);
		frame.add(lbl2);
		
		lbl3=new JLabel("Login");
		lbl3.setBounds(286, 341, 45, 13);
		frame.add(lbl3);
		
		lbl3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new LoginForm();
			}
		});;
			
		con=new JButton("Continue");
		con.setBounds(174, 275, 148, 36);
		frame.add(con);
		
		con.addActionListener(this);
		
		fast=new JTextField();
		fast.setBounds(143, 61, 96, 19);
		frame.add(fast);
		
		last=new JTextField();
		last.setBounds(356, 61, 96, 19);
		frame.add(last);
		
		user=new JTextField();
		user.setBounds(143, 83, 96, 19);
		frame.add(user);
		
		password=new JPasswordField();
		password.setBounds(143, 106, 96, 19);
		frame.add(password);
		
		rpword=new JPasswordField();
		rpword.setBounds(143, 129, 96, 19);
		frame.add(rpword);
		
		address= new JTextArea();
		address.setBounds(143, 178, 96, 36);
		frame.add(address);
		
		city1=new JComboBox<>(cities);
		city1.setBounds(356, 174, 96, 21);
		frame.add(city1);
		
		BOD=new JDateChooser();
		BOD.setBounds(143, 151, 96, 21);
		frame.add(BOD);
		
		male=new JRadioButton("Male");
		male.setBounds(116, 215, 103, 21);
		frame.add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(228, 215, 103, 21);
		frame.add(female);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		java=new JCheckBox("Java");
		java.setBounds(126, 238, 93, 21);
		frame.add(java);
		
		python=new JCheckBox("Python");
		python.setBounds(229, 238, 93, 21);
		frame.add(python);
		
		php=new JCheckBox("PHP");
		php.setBounds(334, 238, 93, 21);
		frame.add(php);
		
		dotnet=new JCheckBox("DotNet");
		dotnet.setBounds(441, 238, 93, 21);
		frame.add(dotnet);
		
		java.addItemListener(this);
		python.addItemListener(this);
		php.addItemListener(this);
		dotnet.addItemListener(this);
		male.addItemListener(this);
		female.addItemListener(this);

		
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Registration();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String FirstName=fast.getText().toString();
		String LastName=last.getText().toString();
		String UserName=user.getText().toString();
		String PassWord=password.getText().toString();
		String Address=address.getText().toString();
		String City=city1.getItemAt(city1.getSelectedIndex()).toString();
		//String BirthDate=BOD.dateFormat(BOD.getDate()).toString();

		
		if(e.getSource()==con) {
			try {
				FileOutputStream fout=new FileOutputStream("E://Registration.txt");
				String bd="\n The Date of Birth is: ";
				String gn="\n The Gender is: ";
				String ce="\n The Couses are: ";
				String cy="\n The City Name is: ";
				String ad="\n The Address is: ";
				String pw="\n The Password is: ";
				String un="\n The User Name is: ";
				String fn="The First Name is: ";
				String ln="\n The Last Name is: ";
				
				
				fout.write(fn.getBytes());
				fout.write(FirstName.getBytes());
				fout.write(ln.getBytes());
				fout.write(LastName.getBytes());
				fout.write(un.getBytes());
				fout.write(UserName.getBytes());
				fout.write(pw.getBytes());
				fout.write(PassWord.getBytes());
				fout.write(ad.getBytes());
				fout.write(Address.getBytes());
				fout.write(cy.getBytes());
				fout.write(City.getBytes());
				fout.write(bd.getBytes());
				//fout.write(BirthDate.getBytes());
				fout.write(gn.getBytes());
				fout.write(ce.getBytes());
				
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block3
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally {
				System.out.print("Sucess");
			}
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==lbl3) {
			new LoginForm();
		}
		
		StringBuffer lan=new StringBuffer();
		String gen="";
		
		if(e.getSource()==java) {
			lan.append("Java");
		}
		if(e.getSource()==python) {
			lan.append("Python");
		}
		if(e.getSource()==php) {
			lan.append("PHP");
		}
		if(e.getSource()==dotnet) {
			lan.append("Dotnet");
		}
		if(e.getSource()==male) {
			gen="Male";
		}
		if(e.getSource()==female) {
			gen="Female";
		}
	}
}
