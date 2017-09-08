
public class JB {
	Vault myVault;

	public JB(Vault v) {
		this.myVault = v;

	}

	public int guessCode() {
		for (int bt = 0; bt<1000000; bt++) {
			if (myVault.tryCode(bt)==true) {
				return bt;
			}
		}
		return -1;
		}

}
