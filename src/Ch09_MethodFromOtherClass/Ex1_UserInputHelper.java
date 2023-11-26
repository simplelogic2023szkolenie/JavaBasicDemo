package Ch09_MethodFromOtherClass;

import java.util.Scanner;

public class Ex1_UserInputHelper {
    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int number = scanner.nextInt();
        return number;
    }

    public static String getTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        return scanner.nextLine();
    }

    public static String getOptionFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje");
        System.out.println("- add");
        System.out.println("- subtract");
        System.out.println("- multiply");
        System.out.println("- divide");
        return scanner.nextLine();
    }
}
