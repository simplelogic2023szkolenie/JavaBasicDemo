package Ch03_Swtich;

import java.util.Scanner;

public class Ex4_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String browser = scanner.nextLine();

        switch (browser) {
            case "chrome":
                System.out.println("Chrome jest wspierany");
                break;
            case "firefox":
                System.out.println("Firefox jest wspierany");
                break;
            default:
                System.out.println(browser + " nie jest wspierany");
                break;
        }
        System.out.println("Koniec programu");
    }
}
/*
Napisz program, który pobierze od użytkownika nazwę przeglądarki i przechowa ją w zmiennej typu String.

Stwórz instrukcję switch. Dodaj w niej obsługę przypadków "chrome" oraz "firefox". Każdy 'case' powinien wypisać tekst
"przeglądarka <nazwa_przeglądarki> jest wspierana"

Jeżeli użytkownik poda nazwę przeglądarki, która nie jest wspierana wypisz tekst: "przeglądarka nie jest wspierana <tutaj_nazwa_przeglądarki_od_użytkownika>"

 */
