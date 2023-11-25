package Ch10_MethodOverloading;

public class Ex1_MethodOverloading {
    public static void main(String[] args) {
        add(5, 3);
        add(5, 3, 6);
        add(5, "123");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, String text) {
        return a + Integer.parseInt(text);
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
