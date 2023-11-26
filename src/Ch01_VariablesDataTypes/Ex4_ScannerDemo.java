package Ch01_VariablesDataTypes;


import java.util.Scanner;

public class Ex4_ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj, jak masz na imie?");

        String name = scanner.nextLine();

        System.out.println("witaj " + name);
        System.out.println("ile masz lat");

        int age = scanner.nextInt();
        System.out.println("super tez mam :" + age + " lat");

    }
}
