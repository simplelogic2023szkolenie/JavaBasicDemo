package Ch26_MovieLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void printRandomMovie(){
        Random random = new Random();
        System.out.println(movies.get(random.nextInt(movies.size())));
    }

    public void printMovieTitlesBetweenYears(int startYear, int endYear){
        for (Movie movie : movies){
            if(movie.getYearOfProduction() >= startYear && movie.getYearOfProduction() <= endYear){
                System.out.println(movie.getTitle());
            }
        }
    }
    public void printMoviesWithActor(String firstName, String lastName){
        for (Movie movie : movies){
            for (Actor actor : movie.getActors()){
                if(actor.getFirstName().equals(firstName) && actor.getLastName().equals(lastName)){
                    System.out.println(movie.getTitle());
                    break;
                }
            }
        }

    }
}
