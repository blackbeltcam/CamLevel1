import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fortune_Cookie implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JButton button;	
public static void main(String[] args) {
	Fortune_Cookie fortune = new Fortune_Cookie();
	fortune.showButton();
	
	
	
	
	
	
	
	
	
	
}
public Fortune_Cookie(){
	frame = new JFrame();
	frame.setSize(300, 100);
	
	panel = new JPanel();
	frame.add(panel);
	
	button = new JButton();
	button.setText("Click for fortune!");
	panel.add(button);
	
	button.addActionListener(this);
}
	



public void showButton(){
	frame.setVisible(true);
}
public void showFortune(){
	String message;
	System.out.println("ufo");
	int rand = new Random().nextInt(4);
	switch (rand){
	case 0:
		JOptionPane.showMessageDialog(null,  "You will come into great wealth");
		break;
	case 1:
		JOptionPane.showMessageDialog(null,  "Someone will do you kindness");
	break;
	case 2:
		JOptionPane.showMessageDialog(null,  "A smile is your passport into the hearts of others");
	break;
	case 3:
		JOptionPane.showMessageDialog(null, "You learn form your mistakes... You will learn a lot today.");
		break;
	}
}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	if (event.getSource().equals(button)){
		showFortune();
	}
}






}
