package Ch20_25_Extras.Ch21_AbstractEvents;

import java.util.List;

public class Conference extends Event {
    private String topic;
    private String conferenceType;
    private List<String> speakers;
    private int participantCount;

    public Conference(String name, String date, String location, String topic, String conferenceType, List<String> speakers, int participantCount) {
        super(name, date, location);
        this.topic = topic;
        this.conferenceType = conferenceType;
        this.speakers = speakers;
        this.participantCount = participantCount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getConferenceType() {
        return conferenceType;
    }

    public void setConferenceType(String conferenceType) {
        this.conferenceType = conferenceType;
    }

    public List<String> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    public int getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(int participantCount) {
        this.participantCount = participantCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Conference{" +
                "name='" + getName() + '\'' +
                ", date='" + getDate() + '\'' +
                ", location='" + getLocation() + '\'' +
                "topic='" + topic + '\'' +
                ", conferenceType='" + conferenceType + '\'' +
                ", speakers=" + speakers +
                ", participantCount=" + participantCount +
                '}');
    }
}
