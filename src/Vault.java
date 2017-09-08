
public class Vault {
int myCode;

public Vault(int code) {
	this.myCode=code;
	

	
	
	
	
}
public boolean tryCode(int code) {
	if (myCode==code) {
		return true;
	}
	else return false;
}





}