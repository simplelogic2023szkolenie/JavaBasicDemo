package Ch04_Loops;

import java.util.Scanner;

public class Ex1_Iplusplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);

        i = i + 1;
        System.out.println(i);

        i += 1;
        System.out.println(i);

        i += 3;
        System.out.println(i);

        i -= 10;
        System.out.println(i);

        i = ++i;
        System.out.println(i);


    }
}
