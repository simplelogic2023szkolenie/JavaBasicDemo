package Ch4_Loops;

public class Ex5_ForBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }
        }
        System.out.println("koniec programu");
    }
}
