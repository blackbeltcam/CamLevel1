import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_A_Mole implements ActionListener {
	JFrame frame = new JFrame();
	Random r = new Random();
	int rand = r.nextInt(24);
	static int moleTracker = 0;
public static void main(String[] args) {
	new Whack_A_Mole();
	
	
	
	
	
	
	
}
public Whack_A_Mole() {
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setTitle("Whack A Mole");
	frame.setVisible(true);
	
	
	JPanel panel = new JPanel();
	frame.add(panel);
	
	
	
	for (int hi = 0; hi<24; hi++) {
		JButton b = new JButton();
		panel.add(b);
		if (hi==rand) {
			b.setText("mole!");
		}
		b.addActionListener(this);
	}
	
	
	frame.setSize(300, 340);
	frame.setResizable(false);
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b = (JButton)e.getSource();
	if (b.getText().equals("mole!")) {
		moleTracker+=1;
		frame.dispose();
		new Whack_A_Mole();
	}
	
			System.out.println(moleTracker);
}






}
