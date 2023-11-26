package Ch05_Arrays;

import java.util.Scanner;

public class Ex5_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * i;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("liczba stojaca na indeksie " + i + " to: " + tab[i]);
            ;
        }
    }
}

/*
Stwórz zmienną int n i przypisz to niej dowolną wartość > 0.
Stwórz tablice n elementową.
Przy pomocy pętli ustaw wartości przechowywane w tablicy. Do każdego elementu tablicy przypisz kwadrat jego indeksu.
Czyli np. tab[3] powinno przechowywać liczbę 9
Na koniec wydrukuj liczby z tabeli używając formatowania:
		element o indeksie 1 to 1
		element o indeksie 2 to 4


 */
