
public class HarryPotterRunner {
	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter hair = new HarryPotter();
		// 2. become invisible
		hair.makeInvisible(true);
		// 3. spy on professor snape
		hair.spyOnSnape();
		// 4. become visible again
		hair.makeInvisible(false);
		// 5. cast a “stupefy” spell
		hair.castSpell("Stupefy");
	}
}
