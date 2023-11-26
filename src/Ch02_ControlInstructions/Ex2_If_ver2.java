package Ch02_ControlInstructions;

import java.util.Scanner;

public class Ex2_If_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwsza liczbe");
        int a = scanner.nextInt();

        System.out.println("podaj druga liczbe");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        }

        if (a < b) {
            System.out.println("a<b");
        }

        if (a == b) {
            System.out.println("a==b");
        }
    }
}

/*
Pobierz z konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.
	„a jest mniejsze od b”
 	„a jest większe od b”
	„a jest równe b”
 */
