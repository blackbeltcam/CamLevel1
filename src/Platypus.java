
public class Platypus {
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	public Platypus(String nam){
	name=nam;
	}
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus odd = new Platypus("Perry");
		Platypus chaddy = new Platypus("Blibi");
		//2. Call the sayHi method
		odd.sayHi();
		chaddy.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
			
		}
	}


