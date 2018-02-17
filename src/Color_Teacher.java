import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Color_Teacher implements ActionListener { 
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	public Color_Teacher() {
		button_Stuff();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setName("Color Teacher");
		frame.setSize(350, 65);
		
		JPanel panel = new JPanel();
		frame.add(panel);	
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	}
public static void main(String[] args) {
	 new Color_Teacher();

	
}

public void button_Stuff() {
	button1.setBackground(Color.YELLOW);	
	button1.setOpaque(true);
	
	button2.setBackground(Color.RED);
	button2.setOpaque(true);
	
	button3.setBackground(Color.BLUE);
	button3.setOpaque(true);
	
	button4.setBackground(Color.GREEN);
	button4.setOpaque(true);
	
	
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button1) {
		speak("yellow");
	}
	if (e.getSource()==button2) {
		speak("red");
	}
	if (e.getSource()==button3) {
		speak("blue");
	}
	if (e.getSource()==button4) {
		speak("green");
	}
	
		
	
}
void speak(String words) {
	try {
		Runtime.getRuntime().exec("say "+words);
	}catch (IOException e) {
		e.printStackTrace();
	}
}
}
