
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {
	 public static void main(String[] args) throws MalformedURLException {
		 Jstuff();
		 
		 
		 
	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */

		 	
	       
	    }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
	 public static void Jstuff() {
		 JFrame frame = new JFrame();
		 frame.setTitle("Cat doesnt know fisics");
		 frame.setSize(350, 350);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
		 
		 
		 String urlJumping = "http://68.media.tumblr.com/38998a4548b4b6b2498f8936c4aaf1de/tumblr_nhwymcVYiT1s612eao1_400.gif";
		 
		 try {
			frame.add(createImage(urlJumping));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 frame.pack();
	     
		 
		 
		 
		 
		 
		 
	 }
}


