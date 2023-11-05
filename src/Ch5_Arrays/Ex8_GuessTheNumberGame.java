package Ch5_Arrays;
import java.util.Random;
public class Ex8_GuessTheNumberGame {
    int numberToGuess = new Random().nextInt(100);
}


/*
import java.util.Random;
public class Ex8_GuessTheNumberGame {
    int numberToGuess = new Random().nextInt(100);
}

Powyższy kod spowoduje przypisanie do zmiennej 'numberToGuess' losowo wybranej liczby z zakresu 0-99. 

Gra w zgadywanie polegająca na tym, że program losuje liczbę, a użytkownik próbuje ją odgadnąć.

Wymagania:
1. Program losuje liczbę z zakresu 0-99.

2. Program wyświetla komunikat z prośbą o rozpoczęcie zgadywania liczby całkowitej z zakresu 0-99

3. Program wczytuje liczbę wpisaną przez użytkownika.

4. Użytkownik powinien mieć maksymalnie 5 prób zgadywania.

5. Zachowanie programu podczas podania niepoprawnej liczby:
- w przypadku podania zbyt dużej liczby wypisać do konsoli: "Your number is GREATER than the one you are trying to guess"
- w przypadku podania zbyt małej liczby wypisać do konsoli: "Your number is LOWER than the one you are trying to guess"
- podać ile prób zostało mu do końca.
- jeżeli nie była to jego ostatnia próba to wypisać tekst: "Please try again"


6. Jeżeli użytkownik zgadł liczbę, program powinien wydrukować tekst "You guessed it!"  i się zakończyć

7. Jeżeli w ciągu 5 prób nie udało się odgadnąć liczby użytkownik, program ma wydrukować wiadomość:
"Sorry you didn't guess the number, the answer was: "
oraz dopisać do niej jaka była wartość liczby której nie udało się odgadnąć i się zakończyć
 */