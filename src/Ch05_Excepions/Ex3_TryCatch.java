package Ch05_Excepions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(2 / scanner.nextInt());
            System.out.println("tutaj jest ostatnia linikja bloku TRY");
        } catch (InputMismatchException e) {
            System.out.println("niestety nie podales liczby");
        }


        System.out.println("koniec programu, do zobaczenia");
    }
}
