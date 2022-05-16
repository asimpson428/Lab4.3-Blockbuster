import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(0, "Beauty & The Beast");
		movies.add(1, "The Lion King");
		movies.add(2, "Aladdin");
		movies.add(3, "Mulan");
		movies.add(4, "Cinderella");
		movies.add(5, "Snow White");
		
		ArrayList<Movie> category = new ArrayList<>();
		movies.add(0, "Animated");
		movies.add(1, "Animated");
		movies.add(2, "Action");
		movies.add(3, "Action");
		movies.add(4, "Rom-Com");
		movies.add(5, "Rom-Come");
		
		ArrayList<Movie> runtime = new ArrayList<>();
		movies.add(0, "100 minutes");
		movies.add(1, "92 minutes");
		movies.add(2, "120 minutes");
		movies.add(3, "77 minutes");
		movies.add(4, "80 minutes");
		movies.add(5, "90 minutes");
		
		
		
		System.out.println("Welcome to GC Blockbuster!");
		System.out.println("Please select a movie from the list below:");
		System.out.println(movies);
		System.out.println("Please select the movie you want to watch:");
		int response = scan.nextInt();
		
		
		
		

	}

}
