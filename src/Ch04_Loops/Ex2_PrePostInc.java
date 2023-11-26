package Ch04_Loops;

public class Ex2_PrePostInc {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        int a = 5;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
