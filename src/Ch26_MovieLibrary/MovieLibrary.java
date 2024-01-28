package Ch26_MovieLibrary;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void printMoviesBetweenYears(int startYear, int endYear){

    }
}
