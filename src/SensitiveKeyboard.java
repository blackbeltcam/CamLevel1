
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	public SensitiveKeyboard() {
		frame.addKeyListener(this);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SensitiveKeyboard sk = new SensitiveKeyboard();
	}

	JFrame frame = new JFrame();

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
System.out.println("dont touch me");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("");
	}

}
