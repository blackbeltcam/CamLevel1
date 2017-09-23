import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	JButton b1=new JButton("+");
	JButton b2=new JButton("-");
	JButton b3=new JButton("*");
	JButton b4=new JButton("/");
	
	
public static void main(String[] args) {
	
	
	Calculator cal = new Calculator();
	
	
	
}
	public Calculator() {
	setVisible(true);
	setSize(500, 500);
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.CENTER);
	add(p3, BorderLayout.SOUTH);
	
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	p1.add(tf1);
	p1.add(tf2);
	
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	p2.add(b4);
	
	JLabel l1=new JLabel("Answer:");
	p3.add(l1);
	
		
}




}
