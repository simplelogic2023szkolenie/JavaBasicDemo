package Ch6_Methods;

import java.util.Scanner;

public class Ex7_MethodsWithScannerPractice {
    public static void main(String[] args) {
        int number = getNumberFromUser();
        System.out.println(number);
        System.out.println(getNumberTextUser());
    }

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        // najpierw przypisuje wartosć do zmiennej,
        int number = scanner.nextInt();
        // a potem zwacamy wartość zmiennej
        return number;
    }

    public static String getNumberTextUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        // tutaj od razu zwracamy to co wpisał user
        // bez wcześniejszego zapisywania do zmiennej
        return scanner.nextLine();
    }
}

// zrób metode void printGetNumberMsg() -> ma drukować tekst "podaj liczbe"
// zrób metode void printGetTextMsg() -> ma drukować tekst "podaj tekst"

// następnie zrób 2 metody
// >PIERWSZA ma zwracac: int (pobrany od użytkownika),
// >>>zanim go pobierze powinna uruchomić metode printGetNumberMsg()
// >>>aby wydrukować użytkonikowi odpowiednią prośbę

// >DRUGA ma zwracac: String (pobrany od użytkownika)
// >>>zanim go pobierze powinna uruchomić metode printGetTextMsg()
// >>>aby wydrukować użytkonikowi odpowiednią prośbę

// w metodzie main() uruchom metody, które zwracają int oraz string
// wydrukuj do kosoli wartości jakie zostały zwrocone
