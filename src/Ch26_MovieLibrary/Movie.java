package Ch26_MovieLibrary;

import java.util.List;

public class Movie {
    private String title;
    private int yearOfProduction;
    private Director director;
    private List<Actor> actors;

    public Movie(String title, int yearOfProduction, Director director, List<Actor> actors) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
