package Ch16_Encapsulation;

public class Ex3_Program {
    public static void main(String[] args) {

    }
}

/**
 * Utwórz klasę Address (wraz z konstruktorem i getterami) zawierającą:
 * Pola: private String street, private  int number
 * <p>
 * Utwórz klasę Person (wraz z konstruktorem i getterami) zawierającą:
 * Pola: private  String firstName, private  String lastName, private  Address address
 * <p>
 * Stwórz klasę Letter (wraz z konstruktorem inicjalizującym wszystkie pola)
 * Pola:
 * private Person sender
 * private List<Person> recipients
 * - private String content
 * <p>
 * Metoda:
 * public void send() - która wypisze do konsoli dane odnośnie emaila: nadawcę (imię, nazwisko, adres),
 * listę adresatów (imiona, nazwiska, adresy) oraz content
 * <p>
 * W klasie LetterProgram i metodzie mai()n stwórz obiekt klasy Letter (wraz z innymi do tego potrzebnymi obiektami)
 * i uruchom na nim metodę send().
 */