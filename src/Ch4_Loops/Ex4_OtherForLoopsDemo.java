package Ch4_Loops;

public class Ex4_OtherForLoopsDemo {
    public static void main(String[] args) {
        // nie wykona sie ani razu
        // warunek jest od razu falszywy
        System.out.println("petla 1");
        for (int i = 0; i > 1; i++) {
            System.out.println(i);
        }
        System.out.println("koniec 1\n");

        // petla skonczy sie dopiero az skonczy sie zakres typu danych short
        // warunek jest zawsze prawdziw
        System.out.println("petla 2");
        for (byte i = 0; i > -1; i++) {
            System.out.println(i);
        }
        System.out.println("koniec 2\n");

        System.out.println("petla 3");
        for (int i = 10; i > 0; i--) {
            System.out.println("wartosc i: " + i);
        }
        System.out.println("koniec 3");


    }
}
