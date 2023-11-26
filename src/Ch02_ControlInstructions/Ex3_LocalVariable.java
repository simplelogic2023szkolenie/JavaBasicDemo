package Ch02_ControlInstructions;

import java.util.Scanner;

public class Ex3_LocalVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz wspolpracowac? tak/nie");
        String decision = scanner.nextLine();

        if (decision.equals("tak")) {

            System.out.println("Podaj imie");
            String name = scanner.nextLine();
            System.out.println("witaj " + name);
        }
        // poniżysz kod powodałby bład poniewaz name jest zmienną lokalną
        // w bloku if - i tylko tam moze być użyta, bo w nim została zadeklarowana
//         System.out.println("witaj " + name);

        System.out.println("koniec programu");
    }
}
