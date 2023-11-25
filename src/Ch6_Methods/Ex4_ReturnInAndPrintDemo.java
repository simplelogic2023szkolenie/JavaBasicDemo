package Ch6_Methods;

public class Ex4_ReturnInAndPrintDemo {
    public static void main(String[] args) {
        System.out.println("START");
        System.out.println(getNumber());

        int x = getNumber();
        System.out.println("x to: " + x + " a tutaj z metody: " + getNumber());
        System.out.println("END");
    }

    public static int getNumber() {
        System.out.println("im inside shouldReturnSomeInt method");
        return 15;
    }

}