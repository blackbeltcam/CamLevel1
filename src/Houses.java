import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(7);
		Tortoise.setX(10);
		Tortoise.setY(433);
		Tortoise.setPenWidth(4.5);
		for (int blah=1; blah<=10;blah++){
			
		
		DrawHouse();
	}
	}
	private static void DrawHouse() {
		int r=new Random().nextInt(230)+50;
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(r);
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(r);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(30);
		Tortoise.turn(-90);
	}
}
