import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lottery_Numbers implements ActionListener {
	JButton generate = new JButton("              Generate              ");
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel label6 = new JLabel();
	
	

	public static void main(String[] args) {
		new Lottery_Numbers().Numbers();
	}

	public void Numbers() {
		JFrame frame = new JFrame();
		frame.setTitle("Lottery");
		frame.setSize(300, 300);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.add(panel);

		panel.add(generate);
		frame.pack();
		generate.addActionListener(this);
		
		
		
		
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random=new Random();
		
		String y=""+random.nextInt(50);
		
		
		label1.setText(y);
		String r=""+random.nextInt(50);
		label2.setText(r);
		String j=""+random.nextInt(50);
		label3.setText(j);
		String a=""+random.nextInt(50);
		label4.setText(a);
		String k=""+random.nextInt(50);
		label5.setText(k);
		String v=""+random.nextInt(50);
		label6.setText(v);
	}
}
