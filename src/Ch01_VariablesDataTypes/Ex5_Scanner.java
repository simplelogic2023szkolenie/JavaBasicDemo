package Ch01_VariablesDataTypes;


import java.util.Scanner;

public class Ex5_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj, jak masz na imie?");

        String name = scanner.nextLine();

        System.out.println("witaj " + name);

    }
}
/*
Zadanie 3 Scanner
1. Na samym początku pliku napisz linijkę: `import java.util.Scanner;`. To pozwoli nam korzystać z narzędzia do wczytywania danych.
2. Następnie w klamerkach bloku main(){} napisz: `Scanner scanner = new Scanner(System.in);`. Dzięki temu będziemy mogli wczytywać to, co użytkownik wpisuje.
3. Teraz dodaj linijki, które poproszą o imię, wczytają je i wypiszą powitanie:
Witaj <imie_uzytkownika>

 */
