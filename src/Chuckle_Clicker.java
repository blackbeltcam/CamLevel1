import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	JButton button1= new JButton("Joke");
	JButton button2= new JButton("Punchline");
	
	
public static void main(String[] args) {
	new Chuckle_Clicker().makeButtons();
	
	
	
}
public void makeButtons(){
	JFrame frame= new JFrame();
	frame.setTitle("DESTROYED");
	frame.setSize(400, 100);
	
	frame.setVisible(true);
	JPanel panel= new JPanel();
	frame.add(panel);
	
	
	panel.add(button1);
	panel.add(button2);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button1){
		JOptionPane.showMessageDialog(null, "The four most beautiful words in our common language: I told you so.");
	}
	else{
		JOptionPane.showMessageDialog(null, "I want to die peacefully in my sleep, like my grandfather.. Not screaming and yelling like the passengers in his car.");
	}
}
}
/*
Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 

Make a JFrame in makeButtons() method and get it to show.

Add a JPanel and two JButtons and get them to show up like this:

*[Optional] Customize your GUI with setText, setSize, etc.

Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.

Check if the ActionEvent came from the joke button or the punchline button.  
if(arg0.getSource() == jokeButton)
You might need to move the declaration of your buttons above the the makeButtons() method.

Use JOptionPane to print the joke or the punchline depending on which button was clicked.
*/