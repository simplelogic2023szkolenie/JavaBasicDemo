package Ch9_MethodFromOtherClass;

import java.util.Scanner;

public class Ex1_UserInputHandler {
    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int number = scanner.nextInt();
        return number;
    }

    public static String getNumberTextUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        return scanner.nextLine();
    }

    public static String getOptionTextUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje");
        System.out.println("- add");
        System.out.println("- subtract");
        System.out.println("- multiply");
        System.out.println("- divide");
        return scanner.nextLine();
    }
}
