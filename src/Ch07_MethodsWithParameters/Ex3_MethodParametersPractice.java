package Ch07_MethodsWithParameters;

import java.util.Scanner;

public class Ex3_MethodParametersPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        isEven(scanner.nextInt());
    }

    public static void isEven(int number) {
        System.out.println(number);
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}


// stworz metode ktora przyjmue parametr int (void -> metoda nic nie zwraca)
// powinna ona drukowac czy liczba jest parzysta czy nieparzysta i wydrukować tą liczbę

// w metodzie main, pobierz od usera liczbę
// przekaz ją do metdy drukującej info o parzystości