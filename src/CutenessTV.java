
public class CutenessTV {
	
	public static void main(String[] args) {
		showDucks();
	}
	
	
	
	
	static void showDucks() {
		playVideo("https://youtu.be/LGrpsZ7BsQA");
	}

	void showFrog() {
		playVideo("https://youtu.be/cBkWhkAZ9ds");
	}
	
	void showFluffyUnicorns() {
		playVideo("https://youtu.be/DsxMhcQvSCA");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
