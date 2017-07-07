
public class IceCreamVotes_Runner {
	public static void main(String[] args) {
		IceCreamVotes[] iceCreamVotes = new IceCreamVotes[3];
		iceCreamVotes[0] = new IceCreamVotes("Carl", "Strawberry");
		iceCreamVotes[1] = new IceCreamVotes("Lela", "Vanilla");
		iceCreamVotes[2] = new IceCreamVotes("Heubert", "Vanilla");
		
		System.out.println(IceCreamVotes.getnumVotes());
		
		iceCreamVotes[0].setflavor("Chocalate");
		
		for (int batguen=0; batguen<iceCreamVotes.length; batguen++){
			System.out.println(iceCreamVotes[batguen].getpersonName()+" likes "+iceCreamVotes[batguen].getflavor());
		}
			
		
	}
}
/*
 * (e) Using a loop, print name and flavor just as you did in (b). Check that
 * the changes are what you expected. Advanced: create a method to print
 * person/flavor.
 * 
 */