
public class Person_Runner {
	public static void main(String[] args) {
		Person mj = new Person("mj", "telepathy", false, 17);
		System.out.println(mj.getname() + " is " + mj.age);
		mj.age = 12343;
		mj.setname("Harembe");
		System.out.println(mj.getname() + " is " + mj.age);
	}
}
