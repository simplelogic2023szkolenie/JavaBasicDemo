package Ch04_Loops;

public class Ex5_ForContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("koniec programu");
    }
}
