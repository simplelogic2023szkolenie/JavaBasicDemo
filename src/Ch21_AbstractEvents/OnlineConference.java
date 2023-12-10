package Ch21_AbstractEvents;

import java.util.List;

public class OnlineConference extends Conference {

    private String app;

    public OnlineConference(String name, String date, String location, String topic, String conferenceType, List<String> speakers, int participantCount, String app) {
        super(name, date, location, topic, conferenceType, speakers, participantCount);
        this.app = app;
    }

    @Override
    public void displayDetails() {
        // jak coś mozna tak uruchomic wtedy displayDetails() z klasy Conference
        // po ktorej dziedziczymy
        // super.displayDetails();
        System.out.println("OnlineConference{" +
                "name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", location='" + getLocation() + '\'' +
                "topic='" + getTopic() + '\'' +
                ", conferenceType='" + getConferenceType() + '\'' +
                ", speakers=" + getSpeakers() +
                ", participantCount=" + getParticipantCount() +
                ", app=" + app +
                '}');

    }


}
