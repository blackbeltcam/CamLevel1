import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;
 
public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
 
// 1. Create a frame & make it visible
 JFrame fred = new JFrame();
 fred.setVisible(true);
 fred.setSize(2000, 2000);
		// 2. Add the panel to the frame
		fred.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 
		Turtle jeff = new Turtle();
// 5. Add the turtle to the panel 
		panel.addTurtle(jeff);
		// 6. Put 50 Turtles on the beach
		for (int jade=0; jade<=50; jade++){
			Turtle bob = new Turtle();
			bob.setX(new Random().nextInt(panel.getWidth()));
			bob.setY(new Random().nextInt(panel.getHeight()));
			panel.addTurtle(bob);
		}
 
	}
}
