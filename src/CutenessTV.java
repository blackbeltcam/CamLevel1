import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button1=new JButton("  Cute Ducks  ");
	JButton button2=new JButton("  Cute Frogs  ");
	JButton button3=new JButton("  Fluffy Unicorns  ");
	
	public static void main(String[] args) {
		new CutenessTV().makeButtons();
	}
	
	
	public void makeButtons(){
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setTitle("CutenessTV");
		frame.setSize(400, 200);
		
		JPanel panel=new JPanel();
		frame.add(panel);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		
	}
	
	 void showDucks() {
		playVideo("https://youtube.com/watch?v=LGrpsZ7BsQA");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds&feature=youtu.be");
	}
	
	void showFluffyUnicorns() {
		playVideo("https://youtu.be/DsxMhcQvSCA");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
			showDucks();
		}
		else if(e.getSource()==button2){
			showFrog();
		}
		else{
			showFluffyUnicorns();
		}
	}

}
