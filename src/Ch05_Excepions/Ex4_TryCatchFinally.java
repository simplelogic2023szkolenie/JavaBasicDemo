package Ch05_Excepions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4_TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(2 / scanner.nextInt());
            System.out.println("tutaj jest ostatnia linikja bloku TRY");
        } catch (InputMismatchException e) {
            System.out.println("niestety nie podales liczby");
        } finally {
            System.out.println("ja wykonam sie zawsze!!!!!!!!!!!!!");
        }


        System.out.println("koniec programu, do zobaczenia");
    }
}
