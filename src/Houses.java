import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setX(10);
		Tortoise.setY(433);
		Tortoise.setPenWidth(4.5);
		for (int blah = 1; blah <= 9; blah++) {
			int y = new Random().nextInt(2);
			if (y == 0) {
				DrawHousePointy();
			} else if (y == 1) {
				DrawHouseFlat();
			}
		}
	}

	private static void DrawHouseFlat() {
		int r = new Random().nextInt(230) + 50;
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

	private static void DrawHousePointy() {
		int w = new Random().nextInt(230) + 50;
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(w);
		Tortoise.turn(45);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(45);
		Tortoise.move(w);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(30);
		Tortoise.turn(-90);
	}

}
