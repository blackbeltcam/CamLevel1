import java.awt.Color;

public class Picasso_Runner {
public static void main(String[] args) {
	ColorPalette cp=new ColorPalette(new Color(0x008833), new Color (0x551155), new Color (0xEE00FF) );
	Picasso cx=new Picasso();
	cx.drawPalette(cp);
	
	
	
}
}
