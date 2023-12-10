package Ch21_AbstractEvents;

import java.util.List;

public class SportsMeeting extends Event{
    private String sport;
    private List<String> teams;

    public SportsMeeting(String name, String date, String location, String sport, List<String> teams) {
        super(name, date, location);
        this.sport = sport;
        this.teams = teams;
    }

    @Override
    public void displayDetails() {
        System.out.println("SportsMeeting{" +
                "name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", location='" + getLocation() + '\'' +
                "sport='" + sport + '\'' +
                ", teams=" + teams +
                '}');
    }


}
