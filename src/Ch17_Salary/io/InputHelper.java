package Ch17_Salary.io;

import Ch17_Salary.validators.InputValidator;

import java.util.Scanner;

public class InputHelper {

    public static String getText(String msg) {
        System.out.println(msg);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (InputValidator.isValidString(input)) {
                return input;
            }
            System.out.println("Twój string jest pusty, podaj ponownie");
        }
    }

    public static int getNumber(String msg) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(msg);
            String input = scanner.nextLine();
            if (InputValidator.isValidInt(input)) {
                return Integer.parseInt(input);
            }
            System.out.println("nie podales inta, podaj ponownie");
        }
    }


    public static int getPositiveNumber(String msg) {
        while (true) {
            int number = getNumber(msg);

            if (InputValidator.isPositiveInt(number)) {
                return number;
            }
            System.out.println("nie podałej dodaniej wartośći");
        }
    }
}
