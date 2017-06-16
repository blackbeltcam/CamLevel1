
public class NetflixRunner {
	public static void main(String[] args) {
		Movie hue = new Movie("Hue", 2);
		Movie cars = new Movie("Cars", 5);
		Movie pixels = new Movie("Pixels", 4);
		Movie gotg = new Movie("Guardians of the Galaxy 2", 5);
		Movie storks = new Movie("Storks", 4);
		
		System.out.println(gotg.getTicketPrice()+ " for "+ gotg.getTitle());
		System.out.println(hue.getTicketPrice());
		
		NetflixQueue meh = new NetflixQueue();
		meh.addMovie(pixels);
		meh.addMovie(gotg);
		meh.addMovie(hue);
		meh.addMovie(storks);
		meh.addMovie(cars);
		//meh.printMovies();
		
		
		
		meh.sortMoviesByRating();
		for (int bat = 0; bat<=4; bat++){
			System.out.println(meh.getMovie(bat));
		}
	}
}
