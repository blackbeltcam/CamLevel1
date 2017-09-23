import java.awt.Color;

public class ColorPalette {
	private Color c1;
	private Color c2;
	private Color c3;
	public ColorPalette (Color c1, Color c2, Color c3) {
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		
	}
	public Color getcolors (int i) {
		
		if (i==1) {
			return c1;
		}
		else if (i==2) {
			return c2;
		}
		else if (i==3) {
			return c3;
		}
		else {
			return Color.BLACK;
			 
		}
	}
	
	
	
	
	
	
	
	
	
}
