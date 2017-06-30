
public class Particpant {
static int numMiles = 11;
private static int count=0;
String name;

public Particpant(String name){
	this.name=name;
	count++;
}
public int getcount(){
	return count;
}
}
