import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypeOrDIE implements KeyListener {
	
	char currentLetter = generateRandomLetter();
	JLabel label1 = new JLabel(String.valueOf(currentLetter));
	public static void main(String[] args) {
		new TypeOrDIE();

	}

	public TypeOrDIE() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setTitle("Type Cause u Bored");
		frame.add(label1);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(this);
		
		label1.setFont(label1.getFont().deriveFont(28.0f));
		label1.setHorizontalAlignment(JLabel.CENTER);

	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you typed: "+ e.getKeyChar());
		
		if (e.getKeyChar() == currentLetter) {
			label1.setOpaque(true);
			label1.setBackground(Color.GREEN);
		}
		else {
			label1.setOpaque(true);
			label1.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label1.setText(String.valueOf(currentLetter));
	}


}
