import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Red_Green implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	new Red_Green();
	
}

public Red_Green(){
	JFrame frame = new JFrame();
	frame.setName("Red_Green");
	frame.setVisible(true);
	frame.setSize(250, 250);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	
	button1.addActionListener(this);
	button1.setOpaque(true);
	button1.setBackground(Color.GREEN);
	
	button2.addActionListener(this);
	button2.setOpaque(true);
	button2.setBackground(Color.RED);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button1) {
		button1.setBackground(Color.GREEN);
		button2.setBackground(Color.RED);
	}
	else {
		button1.setBackground(Color.RED);
		button2.setBackground(Color.GREEN);
	}
}














}
