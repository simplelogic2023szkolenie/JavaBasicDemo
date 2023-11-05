package Ch4_Loops;

public class Ex6_ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println("sum: " + sum);
    }
}

/*
Zadanie 1
Stwórz pętle, która wypisze liczby podzielne przez 3. Wykonaj to dla liczb z zakresu 1-100.

Zadanie 2
Wypisz do konsoli sumę liczb podzielnych przez 3 i 4 z zakresu  1-100.

Podpowiedzi
% -> obliczanie reszty z dzielenia w języku Java, przykłady:
   5 % 2 -> wynik 1  (reszta z dzielenia 5 przez to 2 to 1)
   number % 2 == 0   (warunek sprawdzający czy zmienna number jest podzielna przez 2 bez reszty)

 */