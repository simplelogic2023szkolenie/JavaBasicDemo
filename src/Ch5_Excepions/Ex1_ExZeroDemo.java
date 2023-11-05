package Ch5_Excepions;

import java.util.Scanner;

public class Ex1_ExZeroDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //podanie 0 wyrzuci wyjatek
        int b = scanner.nextInt();
        int a = 2/b;
        System.out.println(a);
        System.out.println("koniec programu, do zobaczenia");
    }
}
