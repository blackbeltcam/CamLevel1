import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Tweet implements ActionListener {
	JTextPane tweet230 = new JTextPane();
	JTextField field = new JTextField(15);
	JButton button = new JButton("search Tweet");

	public static void main(String[] args) {
		new Tweet().makeFrame();
	}

	public void makeFrame() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setTitle("Tweeting");

		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.CENTER);
		JPanel panel2 = new JPanel();
		frame.add(panel2, BorderLayout.SOUTH);

		panel.add(field);
		panel.add(button);

		button.addActionListener(this);

		tweet230.setEditable(false);

		tweet230.setPreferredSize(new Dimension(500, 500));
		JScrollPane scroll = new JScrollPane(tweet230);
		panel2.add(scroll);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String tweet = getLatestTweet(field.getText());
		tweet230.setText(tweet);
	}

	private String getLatestTweet(String searchingFor) {
		String s = "";

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			for (int ufo = 0; ufo <= 13; ufo++) {

				s += result.getTweets().get(ufo).getText() + "\n \n";
			}
			return s;

		} catch (Exception e) {
			// System.err.print(e.getMessage());
			// return "What the heck is that?";

		}
		return s;
	}

}
