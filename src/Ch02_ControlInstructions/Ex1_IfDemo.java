package Ch02_ControlInstructions;

import java.util.Scanner;

public class Ex1_IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba nie jest parzysta");
        }

        System.out.println("koniec programu");


    }
}
