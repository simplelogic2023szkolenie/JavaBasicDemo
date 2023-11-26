package Ch16_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Ex3_Program {
    public static void main(String[] args) {
        Ex3_Address addressNadawca = new Ex3_Address("Nadawcowa", 25);
        Ex3_Person personNadawca = new Ex3_Person("Artur", "Wysyłacz", addressNadawca);
        String contentN1 = "Jestem wysłaną wiadomością nr 1!";

        Ex3_Address addressAdresataN1 = new Ex3_Address("Ulica pierwsza", 5);
        Ex3_Address addressAdresataN2 = new Ex3_Address("Ulica druga", 10);
        Ex3_Address addressAdresataN3 = new Ex3_Address("Ulica trzecia", 15);

        List<Ex3_Person> adresaci = new ArrayList<>();
        Ex3_Person adresatN1 = new Ex3_Person("Bogdan", "Odbiorca", addressAdresataN1);
        Ex3_Person adresatN2 = new Ex3_Person("Marek", "Oblatywacz", addressAdresataN2);
        Ex3_Person adresatN3 = new Ex3_Person("Andrzej", "Kałczuk", addressAdresataN3);

        adresaci.add(adresatN1);
        adresaci.add(adresatN2);
        adresaci.add(adresatN3);

        Ex3_Letter letterN1 = new Ex3_Letter(personNadawca, adresaci, contentN1);

        letterN1.send();
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