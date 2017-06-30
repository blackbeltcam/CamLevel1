
public class Person {
	private String name;
	private String superpower;
	boolean isMale;
	int age;

	public Person() {

	}

	public Person(String name, String superpower, boolean isMale, int age) {
		this.name = name;
		this.superpower = superpower;
		this.isMale = isMale;
		this.age = age;
	}

	public String getname() {
		return name;
	}

	public void setname(String m) {
		name = m;
	}

	public String getsuperpower() {
		return superpower;
	}

	public void setsuperpower(String s) {
		superpower = s;
	}
}
