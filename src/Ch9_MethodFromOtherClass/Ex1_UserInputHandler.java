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
}
