package Ch04_Loops;

import java.util.Scanner;

public class Ex11_AllLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();

        //for
        for (int i = number; i > 0; i--) {
            System.out.println("seconds to start: " + i);
        }
        System.out.println("start!\n");

        //while
        int whileCounter = number;
        while (whileCounter > 0) {
            System.out.println("seconds to start: " + whileCounter);
            whileCounter--;
        }
        System.out.println("start!\n");

        //do while
        int doWhileCounter = number;
        do {
            System.out.println("seconds to start: " + doWhileCounter);
            doWhileCounter--;
        } while (doWhileCounter > 0);
        System.out.println("start!");
    }
}

/*
Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią.
Następnie napisz program odliczający ilość sekund do startu wyścigu.
	Przykład dla liczby 3 podanej przez użytkownika:
	"Seconds to start: 3"
	"Seconds to start: 2"
	"Seconds to start: 1"
	"START!"
Napisz program w 3 wersjach przy użyciu różnych pętli.

 */
