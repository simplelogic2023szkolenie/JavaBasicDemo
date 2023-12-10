package Ch20_25_Extras.Ch21_AbstractEvents;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Concert concert = new Concert("music festival", "12/12/2024", "waw",
                "dawid", "pop", 100, 80);

        Conference conference = new Conference("IT", "12/12/2024", "waw",
                "testing", "IT", Arrays.asList("mat", "karol"), 100);

        OnlineConference onlineConference = new OnlineConference("IT", "12/12/2024", "waw",
                "testing", "IT", Arrays.asList("mat", "karol"), 100, "msteams");

        SportsMeeting sportsMeeting = new SportsMeeting("meczyk", "12/12/2024", "waw", "pn", Arrays.asList("legia", "wisla"));

        concert.displayDetails();
        conference.displayDetails();
        onlineConference.displayDetails();
        sportsMeeting.displayDetails();
    }
}

/**
 * 1. Stwórz klasę abstrakcyjną `Event` (+konstruktor/gettery/settery):
 * - Zdefiniuj w tej klasie następujące pola: `String name`, `String date`, `String location`.
 * - Zdefiniuj abstrakcyjną!!! metodę `displayDetails()`
 * <p>
 * 2. Stwórz trzy klasy dziedziczące po `Event`
 * a) Klasa `Concert`(+konstruktor/gettery/settery):
 * - Dodaj pola: `String artist`, `String musicGenre`, `int ticketPrice`, `int duration`.
 * - nadpisz metodę `displayDetails()` w celu wyświetlenia szczegółów koncertu (pamiętaj też o polach z klasy bazowej).
 * <p>
 * b) Klasa `Conference`(+konstruktor/gettery/settery):
 * - Dodaj pola: `String topic`, `List<String>speakers`, `String conferenceType`, `int participantCount`.
 * - nadpisz metodę `displayDetails()` w celu wyświetlenia szczegółów konferencji (pamiętaj też o polach z klasy bazowej).
 * <p>
 * c) Klasa `SportsMeeting`(+konstruktor/gettery/settery):
 * - Dodaj pola: `String sport`, `List<String> teams` .
 * - nadpisz metodę `displayDetails()` w celu wyświetlenia szczegółów spotkania sportowego (pamiętaj też o polach z klasy bazowej).
 * <p>
 * 3. Stwórz klasę `Main`, w której przetestujesz działanie systemu:
 * - Utwórz po 1 obiektcie dla każdego typu wydarzenia (`Concert`, `Conference`, `SportsMeeting`), ustawiając ich właściwości.
 * - Wywołaj metodę `displayDetails()` dla każdego z tych obiektów, aby zobaczyć, jak wyświetlane są szczegóły różnych wydarzeń.
 * <p>
 * /
 */