
public class Smurf_Runner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	System.out.println(Handy.getName());
	Handy.eat();
	Smurf Papa = new Smurf("Papa Smurf");
	System.out.println(Papa.getHatColor()); 
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.isGirlOrBoy()); 
}
}
