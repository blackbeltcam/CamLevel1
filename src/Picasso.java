import org.jointheleague.graphical.robot.Robot;
public class Picasso {

	
	
	
	public void drawPalette(ColorPalette kolor) {
		Robot bob= new Robot();
		bob.hide();
		bob.setPenColor(kolor.getcolors(1));
		bob.penDown();
		bob.setPenWidth(10);
		bob.move(100);
		bob.setPenColor(kolor.getcolors(2));
		bob.move(100);
		bob.setPenColor(kolor.getcolors(3));
		bob.move(100);
		
	}
	
	
}
