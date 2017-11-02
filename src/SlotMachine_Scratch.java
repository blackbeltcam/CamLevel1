import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine_Scratch extends JFrame implements ActionListener {
	
	JButton spin = new JButton("SPIN");
	JLabel leftImage1 = new JLabel();
	JLabel centerImage1 = new JLabel();
	JLabel rightImage1 = new JLabel();
	
	private BufferedImage orangeImage;
	private BufferedImage bananaImage;
	private BufferedImage cherryImage;
	private BufferedImage leftImage;
	private BufferedImage centerImage;
	private BufferedImage rightImage;
	
public static void main(String[] args) {
	new SlotMachine_Scratch();
}

public SlotMachine_Scratch () {
	try {
		orangeImage = ImageIO.read(this.getClass().getResourceAsStream("Oranges.jpg"));
		bananaImage = ImageIO.read(this.getClass().getResourceAsStream("Bananas.jpg"));
		cherryImage = ImageIO.read(this.getClass().getResourceAsStream("Cherries.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	leftImage=orangeImage;
	centerImage=bananaImage;
	rightImage=cherryImage;
	
	
	JFrame frame = new JFrame();
	setSize(500, 500);
	setName("SPIN TO WIN!!");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel ();
spin.addActionListener(this);
	
	
}
public void Machine() {
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}









}
