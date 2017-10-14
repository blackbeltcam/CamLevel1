import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	JButton b1=new JButton("+");
	JButton b2=new JButton("-");
	JButton b3=new JButton("*");
	JButton b4=new JButton("/");
	JButton b5=new JButton("%");
	
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	
	JLabel l1=new JLabel("Answer:");
	
public static void main(String[] args) {
	
	
	Calculator cal = new Calculator();
	
	
	
}
	public Calculator() {
	setVisible(true);
	setSize(500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.CENTER);
	add(p3, BorderLayout.SOUTH);
	
	
	p1.add(tf1);
	p1.add(tf2);
	
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	p2.add(b4);
	p2.add(b5);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
	
	p3.add(l1);
	
	pack();
	
		
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double answer=0;
		double n1=Double.parseDouble(tf1.getText());
		double n2=Double.parseDouble(tf2.getText());
		if (e.getSource()==b1) {
			answer=add(n1, n2);
			
		}
		else if (e.getSource()==b2){
			double ans=add(n1, n2);
			answer =subtraction (n1, n2);
			
		}
		else if (e.getSource()==b3){
			answer =multiplication (n1, n2);
		}
		else if (e.getSource()==b4){
			answer=division(n1, n2);
		}
		else if (e.getSource()==b5){
			answer=modulo(n1, n2);
		}
		l1.setText(String.valueOf(answer));
		
	}
	public double add(double n1, double n2){
		return n1+n2;
		
		
	}
	public double subtraction(double n1, double n2){
		return n1-n2;
	}
	public double multiplication(double n1, double n2){
		return n1*n2 ;
	}
	public double division(double n1, double n2){
		return n1/n2;
	}
	public double modulo(double n1, double n2){
		return n1%n2;
	}

}
