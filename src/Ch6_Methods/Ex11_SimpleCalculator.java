package Ch6_Methods;

public class Ex11_SimpleCalculator {
    public static void main(String[] args) {
        System.out.println(add(2,5));
        System.out.println(subtract(10,2));
        System.out.println(divide(10,2));
        System.out.println(multiply(2,5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
/*
1. Stwórz prosty kalkulator.
Zaimplementuj metody: add, subtract, multiply, divide.
Każda z nich powinna przyjmować dwa parametry int i zwrócić wynik działania.

2. W programie w metodzie main() wypisz do konsoli wyniki poniższych działań, używając metod z pkt 1:
2+5
10-2
2*5
10/2
 */