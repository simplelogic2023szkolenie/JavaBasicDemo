package Ch17_Salary;

import Ch17_Salary.io.InputHelper;
import Ch17_Salary.io.Menu;
import Ch17_Salary.models.Company;
import Ch17_Salary.providers.CompanyProvider;
import Ch17_Salary.providers.EmployeeProvider;

public class SalaryProgram {
    public static void main(String[] args) {
        Company company = CompanyProvider.initializeCompany(2);

        while (true) {
            Menu.print();
            int option = InputHelper.getNumber("Wybierz opcje");
            handleUserOption(company, option);
        }
    }

    private static void handleUserOption(Company company, int option) {
        switch (option) {
            case 1:
                company.displaySalarySum();
                break;
            case 2:
                System.out.println(company);
                break;
            case 3:
                company.addEmployee(EmployeeProvider.getEmployeeFromUser());
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("podales opcje spoza zakresu 1-4, twoja opcja: " + option);
        }
    }
}


/**
 * Program "Lista płac:"
 * Stwórz klasę Employee przechowującą imię, nazwisko oraz kwotę wypłaty pracownika.
 * W zależności od dalszej części zadania dodaj odpowiedni konstruktor oraz gettery/settery.
 * Stwórz również metodę getAllData(), która zwróci tekst w formacie „Salary for IMIE NAZWISKO is WYPLATA”
 * (dla chętnych zamiast getAllData zrobić @Override toString())
 * <p>
 * Stwórz klasę Company przechowującą listę pracowników (ArrayList<Employee>)
 * W klasie Main i metodzie main() pobierz od użytkownika dane 5 pracowników (dla każdego imię, nazwisko i wysokość zarobków).
 * Dodaj je do listy przechowywanej w klasie Company
 * <p>
 * Waliduj wprowadzane przez użytkownika dane (imie/nazwisko nie może być puste, a zarobki muszą być wieksze od 0)
 * <p>
 * Po zakończeniu wprowadzania danych przez użytkownika, wyświetl menu programu zawierające 4 opcje:
 * 1 – Print sum of all employees salary
 * 2 – Display all employees data
 * 3 – Add new employee
 * 4 – End program
 * <p>
 * <p>
 * Pobierz od użytkownika wartość liczbową w zależności jaki punkt menu chce uruchomić
 * Opcja 1 – wyświetl sumę zarobków wszystkich pracowników
 * Opcja 2 - Wyświetl dane wszystkich pracowników (imiona, nazwiska, zarobki) korzystając z metody getAllData() (opisane w punkcie 1 zadania)
 * Opcja 3 – użytkownik ma możliwość dodanie kolejnego pracownika do już istniejącej listy
 * Opcja 4 – koniec działania programu
 * <p>
 * Obsłuż powyższe opcje używając instrukcji warunkowej switch
 * <p>
 * Po wybraniu przez użytkownika poprawnego punktu menu, wykonaj wybrane przez użytkownika polecenie,
 * a następnie wyświetl ponownie menu.
 * Użytkownik może dowolnie wiele razy wykonywać poszczególne opcje programu.
 * Działanie programu powinno się zakończyć dopiero kiedy użytkownik wybierze opcję 4.
 */