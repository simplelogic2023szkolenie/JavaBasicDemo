package Ch21_AbstractEvents;

public class Concert extends Event {

    private String artist;
    private String musicGenre;
    private int ticketPrice;
    private int duration;

    public Concert(String name, String date, String location, String artist, String musicGenre, int ticketPrice, int duration) {
        super(name, date, location);
        this.artist = artist;
        this.musicGenre = musicGenre;
        this.ticketPrice = ticketPrice;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Concert{" +
                "name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", location='" + getLocation() + '\'' +
                "artist='" + artist + '\'' +
                ", musicGenre='" + musicGenre + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", duration=" + duration +
                '}');
    }

}
