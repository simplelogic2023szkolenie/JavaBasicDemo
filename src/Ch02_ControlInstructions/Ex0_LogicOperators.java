package Ch02_ControlInstructions;

public class Ex0_LogicOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;

        System.out.println(x + " >  " + y + " wynik: " + (x > y));
        System.out.println(x + " <  " + y + " wynik: " + (x < y));
        System.out.println(x + " >= " + y + " wynik: " + (x >= y));
        System.out.println(x + " <= " + y + " wynik: " + (x <= y));
        System.out.println(x + " == " + y + " wynik: " + (x == y)); // == operator równości
        System.out.println(x + " != " + y + " wynik: " + (x != y)); // != operator nierówności

        System.out.println("=========");

        // && -> (i) -> koniuncja
        // || -> (lub) -> alternatywa

        // x= 10, y = 12
        System.out.println(x > 10 && y < 100);
        System.out.println(x > 1 && y < 100);

        System.out.println(x > 10 || y < 100);
        System.out.println(x > 1 || y < 100);


    }
}
