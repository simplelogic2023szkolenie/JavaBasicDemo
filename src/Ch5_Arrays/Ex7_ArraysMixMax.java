package Ch5_Arrays;

import java.util.Scanner;

public class Ex7_ArraysMixMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar tabeli:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("podaj liczbę o indeksie " + i);
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
            sum += number;
        }

        // rzutowanie int sum na double, aby wynik dzielenia był tez double
        double avg = (double) sum / numbers.length;

        System.out.println("avg: " + avg);
        System.out.println("sum: " + sum);
        System.out.println("min " + min);
        System.out.println("max " + max);

    }
}
/*


Pobierz od użytkownika liczbę.
Stwórz tablicę o takim rozmiarze.

W pętli foreach pobieraj od użytkownika liczby i uzupełnij nimi całą tablicę.
Napisz kod, który w tej tablicy znajdzie wartość: maksymalną*, minimalną*
    oraz obliczy średnią wartość i sumę przechowywanych liczb.
 */