package Ch7_CounterPractice;

import java.util.Scanner;

public class Ex1_MenuDemo {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            int option = getOptionFromUser();

            switch (option) {
                case 1:
                    System.out.println("wybrałeś opcję pierwsza");
                    System.out.println("....");
                    System.out.println("....");
                    break;

                case 2:
                    System.out.println("wybrałeś opcję drugą");
                    System.out.println("....");
                    System.out.println("....");
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("wybrałeś niestniejącą opcję: " + option);
            }
        }
    }

    public static int getOptionFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz opcje");
        return scanner.nextInt();
    }

    public static void printMenu(){
        System.out.println("Opcje programu:");
        System.out.println("1 - xxxxx");
        System.out.println("2 - yyyyy");
        System.out.println("3- koniec programu");
    }
}
