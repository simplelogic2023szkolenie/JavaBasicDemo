package Ch02_ControlInstructions;

import java.util.Scanner;

public class Ex3_TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj zarobki");
        double income = scanner.nextDouble();
        // 17% -> do 120 000, 32% -> pow 120 000, pow miliona 37%

        double tax;
        if (income <= 120000) {
            tax = income * 0.17;
        } else if (income < 1000000) {
            tax = 120000 * 0.17 + (income - 120000) * 0.32;
        } else {
            tax = 120000 * 0.17 + 880000 * 0.32 + (income - 1000000) * 0.37;
        }

        System.out.println("podatek do zapłacenia do " + tax);


    }
}
