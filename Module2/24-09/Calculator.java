import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator implements ActionListener
{
	
	JFrame frame;
	JTextField t1,t2;
	JLabel l1;
	JButton plus,minus,div,mul,ce;


	public Calculator() {
		frame=new JFrame();
		
		t1=new JTextField();
		t1.setBounds(71, 59, 96, 19);
		
		t2=new JTextField();
		t2.setBounds(71, 106, 96, 19);
		
		l1=new JLabel();
		l1.setBounds(79, 159, 75, 13);
		
		plus=new JButton("+");
		plus.setBounds(213, 41, 85, 21);
		
		minus=new JButton("-");
		minus.setBounds(213, 72, 85, 21);
		
		mul=new JButton("*");
		mul.setBounds(213, 105, 85, 21);
		
		div=new JButton("/");
		div.setBounds(213, 136, 85, 21);
		
		ce=new JButton("ce");
		ce.setBounds(213, 167, 85, 21);
		
		plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		ce.addActionListener(this);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(l1);
		frame.add(plus);
		frame.add(minus);
		frame.add(mul);
		frame.add(div);
		frame.add(ce);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String num1=t1.getText().toString();
		String num2=t2.getText().toString();
		
		int c=0;
		
		if(e.getSource()==plus) {
			c=Integer.parseInt(num1)+Integer.parseInt(num2);
		}
		
		if(e.getSource()==minus) {
			c=Integer.parseInt(num1)-Integer.parseInt(num2);
		}
		
		if(e.getSource()==mul) {
			c=Integer.parseInt(num1)*Integer.parseInt(num2);
		}
		
		if(e.getSource()==div) {
			c=Integer.parseInt(num1)/Integer.parseInt(num2);
		}
		
		if(e.getSource()==ce) {
			c=0;
		}
		l1.setText("Answer is: "+String.valueOf(c));
	}
}
