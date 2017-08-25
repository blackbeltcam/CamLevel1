import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CandyMan implements ActionListener {
	int Clickcount = 0;
	JButton button1 = new JButton("Candyman");
public static void main(String[] args) {
	new CandyMan().JStuff();
	
	
	
	
	
	
}

public void JStuff () {
	JFrame frame = new JFrame();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setTitle("Click 5 Times");
	frame.setSize(150, 150);
	
	frame.add(button1);
	button1.addActionListener(this);
	
	
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Clickcount+=1;
	System.out.println(Clickcount);
	
	if (Clickcount == (5)){
		Clickcount -=5;
	}
	
	
}




}
