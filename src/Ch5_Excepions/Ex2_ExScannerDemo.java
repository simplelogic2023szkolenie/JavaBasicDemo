package Ch5_Excepions;

import java.util.Scanner;

public class Ex2_ExScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //podanie tekstu wyrzuci wyjatek
        int b = scanner.nextInt();
        System.out.println(b);
        System.out.println("koniec programu, do zobaczenia");
    }
}
