package Ch21_AbstractEvents;

public class Program {
}

/**
 *
 *
 *
 *  1. Stwórz klasę abstrakcyjną `Event` (+konstruktor/gettery/settery):
 *     - Zdefiniuj w tej klasie następujące pola: `String name`, `String date`, `String location`.
 *     - Zdefiniuj abstrakcyjną!!! metodę `displayDetails()`
 *
 *  2. Stwórz trzy klasy dziedziczące po `Event`
 *     a) Klasa `Concert`(+konstruktor/gettery/settery):
 *        - Dodaj pola: `String artist`, `String musicGenre`, `int ticketPrice`, `int duration`.
 *        - nadpisz metodę `displayDetails()` w celu wyświetlenia szczegółów koncertu (pamiętaj też o polach z klasy bazowej).
 *
 *     b) Klasa `Conference`(+konstruktor/gettery/settery):
 *        - Dodaj pola: `String topic`, `List<String>speakers`, `String conferenceType`, `int participantCount`.
 *        - nadpisz metodę `displayDetails()` w celu wyświetlenia szczegółów konferencji (pamiętaj też o polach z klasy bazowej).
 *
 *     c) Klasa `SportsMeeting`(+konstruktor/gettery/settery):
 *        - Dodaj pola: `String sport`, `List<String> teams` .
 *        - nadpisz metodę `displayDetails()` w celu wyświetlenia szczegółów spotkania sportowego (pamiętaj też o polach z klasy bazowej).
 *
 *  3. Stwórz klasę `Main`, w której przetestujesz działanie systemu:
 *     - Utwórz po 1 obiektcie dla każdego typu wydarzenia (`Concert`, `Conference`, `SportsMeeting`), ustawiając ich właściwości.
 *     - Wywołaj metodę `displayDetails()` dla każdego z tych obiektów, aby zobaczyć, jak wyświetlane są szczegóły różnych wydarzeń.
 *
 * /
 *
 *
 *
 *
 */