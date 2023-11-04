package Ch1_VariablesDataTypes;

public class Ex6_MathematicOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        System.out.println(x+y); // -> 12
        System.out.println("Hello" + x+y); // -> Hello102
        System.out.println("Hello" + (x+y)); // -> Hello12

        int sum = x+y+100;
        System.out.println(sum);

        int diff = y-x;
        System.out.println(diff);

        // tutaj wynik bedzie bez miejsc po przcinku, bo jest to zmienne int
        System.out.println(x/y);
        System.out.println(x*y);


        // jeżeli chcemy mieć wynik z miejscami po przecinku
        // musimy mieć zmienne typu double (zmiennoprzecinkowe)
        double a = 10;
        double b = 2.2;

        double result = a/b;
        System.out.println(result);


    }
}
