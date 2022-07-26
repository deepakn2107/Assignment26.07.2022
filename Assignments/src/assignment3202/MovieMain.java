package assignment3202;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieMain {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();

		movies.add(new Movie("Varisu", "VijayRajendran", 135, 2023));
		movies.add(new Movie("Beast", "Nelson", 135, 2022));
		movies.add(new Movie("Master", "Lokesh", 135, 2021));
		movies.add(new Movie("Bigil", "Atlee", 135, 2019));
		movies.add(new Movie("Sarkar", "Murugados", 135, 2018));
		movies.add(new Movie("Bairavaa", "Bharathan", 135, 2017));
		movies.add(new Movie("Theri", "Atlee", 135, 2016));
		movies.add(new Movie("Puli", "ChimbuDevan", 135, 2015));
		movies.add(new Movie("Kaththi", "Murugados", 135, 2014));
		movies.add(new Movie("Jilla", "Neason", 135, 2014));
		movies.add(new Movie("Thalaiva", "L.Vijay", 135, 2013));
		movies.add(new Movie("Thuppakki", "Murugados", 135, 2012));

		movieDirector(movies);
	}

	public static void movieDirector(List<Movie> movie) {
		Map<String, String> mapMovie = new HashMap<String, String>();
		for (Movie m : movie)
			mapMovie.put(m.getName(),  m.getDirectorName());

		for (Map.Entry<String, String> entry : mapMovie.entrySet())
			System.out.println("Movie Name: " + entry.getKey() + "\t\t" + " Director Name: " + entry.getValue());

	}

}