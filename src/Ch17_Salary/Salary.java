package Ch17_Salary;

public class Salary {

}

/**
 * Program "Lista płac:"

 cz1
 * Stwórz klasę Employee przechowującą imię, nazwisko oraz kwotę wypłaty pracownika.
 * dodaj odpowiedni konstruktor oraz gettery/settery.
 * Stwórz również metodę getAllData(), która zwróci tekst w formacie „Salary for IMIE NAZWISKO is WYPLATA”
 * (dla chętnych zamiast getAllData zrobić @Override toString())

 * Stwórz klasę Company przechowującą listę pracowników (ArrayList<Employee>)

 cz2
 * Stwórz klasę InputHelper posiadającą metody:
 *
 * - public String getTextFromUser(String msg)
 *     powinna wydrukować do konsoli text parametru msg
 *     pobrać od użytkownika tekst używając Scannera
 *     zwrócić tekst pobrany od użytkownika
 *
 * - public int getNumberFromUser(String msg)
 *     powinna wydrukować do konsoli text parametru msg
 *     pobrać od użytkownika int używając Scannera
 *     zwrócić liczbę pobraną od użytkownika
 *
 cz3
 * W klasie SalaryProgram i metodzie main()
 *
 * stwórz zmienną employees typu ArrayList<Employee> i zainicjalizuj pustą listę
 *
 * w pętli for (5 powtórzeń) za każdym razem wykonaj:
 *      pobierz od użytkonika - imie, nazwisko, wyplate (używając metod z InputHelper)
 *      uzyj tych wartości to stworzenia obietku klasy Employee
 *      dodaj stworzonego employee do listy employees
 *

 cz4
 * w klasie Company stwórz konstruktor, który zainicjalizuje listę przechowywanych pracowników
 * stwórz metoę displaySalarySum() która wyświetli sumę zarobków wszystkich pracowników
 *
 *
 * w klasie SalaryProgram i metodzie main() stwórz obiekt klasy company i przekaż
 * do konstruktora utworzoną wcześniej listę pracowników
 * no obiektice company uruchom metodę displaySalarySum() i sprawdz czy wydrukowała poprawną wartość

 *
 */