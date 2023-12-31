package Ch08_ClassVariable;

import java.util.Scanner;

public class Ex3_CounterPractice {
    static int value = 0;

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int option = getOptionFromUser();

            switch (option) {
                case 1:
                    increase();
                    break;
                case 2:
                    decrease();
                    break;
                case 3:
                    displayValue();
                    break;
                case 4:
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

    public static void printMenu() {
        System.out.println("Opcje programu:");
        System.out.println("1 - increase");
        System.out.println("2 - decrease");
        System.out.println("3 - displayValue");
        System.out.println("4- koniec programu");
    }

    public static void increase() {
        value++;
    }

    public static void decrease() {
        value--;
    }

    public static void displayValue() {
        System.out.println("Wartość licznika: " + value);
    }
}


// Zadanie: Prosty Licznik

// 1. Stwórz klasę o nazwie CounterPractice.

// 2. Wewnątrz klasy zadeklaruj zmienną na poziomie klasy, która będzie przechowywać wartość licznika.
//    Na przykład: static int value = 0;

// 3. Dodaj metodę do zwiększania wartości licznika:
//    - public static void increase() { value++; }

// 4. Dodaj metodę do zmniejszania wartości licznika:
//    - public static void decrease() { value--; }

// 5. Dodaj metodę do wyświetlania obecnej wartości licznika:
//    - public static void displayValue() { System.out.println("Wartość licznika: " + value); }

// 6. W metodzie main() zaimplementuj prosty interfejs użytkownika z wykorzystaniem pętli while(true) i klasy Scanner:
//    a. Wyświetl użytkownikowi opcje: 1 - Zwiększ licznik, 2 - Zmniejsz licznik, 3 - Pokaż wartość, 0 - Wyjdź.
//    b. Wczytaj wybór użytkownika.
//    c. Na podstawie wyboru użytkownika, wykonaj odpowiednią operację.
//    d. W przypadku wyboru "0", zakończ program za pomocą System.exit(0).
//    e. W przypadku wybrania nieistniejącej opcji, wyświetl komunikat "Niepoprawna opcja, spróbuj ponownie".

