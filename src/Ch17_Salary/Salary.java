package Ch17_Salary;

public class Salary {
}

/**
 *
 * Program "Lista płac:"
 * Stwórz klasę Employee przechowującą imię, nazwisko oraz kwotę wypłaty pracownika.
 * W zależności od dalszej części zadania dodaj odpowiedni konstruktor oraz gettery/settery.
 * Stwórz również metodę getAllData(), która zwróci tekst w formacie „Salary for IMIE NAZWISKO is WYPLATA”
 * (dla chętnych zamiast getAllData zrobić @Override toString())
 *
 * Stwórz klasę Company przechowującą listę pracowników (ArrayList<Employee>)
 * W klasie Main i metodzie main() pobierz od użytkownika dane 5 pracowników (dla każdego imię, nazwisko i wysokość zarobków).
 * Dodaj je do listy przechowywanej w klasie Company
 *
 *  Waliduj wprowadzane przez użytkownika dane (imie/nazwisko nie może być puste, a zarobki muszą być wieksze od 0)
 *
 * Po zakończeniu wprowadzania danych przez użytkownika, wyświetl menu programu zawierające 4 opcje:
 * 1 – Print sum of all employees salary
 * 2 – Display all employees data
 * 3 – Add new employee
 * 4 – End program
 *
 *
 * Pobierz od użytkownika wartość liczbową w zależności jaki punkt menu chce uruchomić
 * Opcja 1 – wyświetl sumę zarobków wszystkich pracowników
 * Opcja 2 - Wyświetl dane wszystkich pracowników (imiona, nazwiska, zarobki) korzystając z metody getAllData() (opisane w punkcie 1 zadania)
 * Opcja 3 – użytkownik ma możliwość dodanie kolejnego pracownika do już istniejącej listy
 * Opcja 4 – koniec działania programu
 *
 * Obsłuż powyższe opcje używając instrukcji warunkowej switch
 *
 * Po wybraniu przez użytkownika poprawnego punktu menu, wykonaj wybrane przez użytkownika polecenie,
 * a następnie wyświetl ponownie menu.
 * Użytkownik może dowolnie wiele razy wykonywać poszczególne opcje programu.
 * Działanie programu powinno się zakończyć dopiero kiedy użytkownik wybierze opcję 4.
 *
 */