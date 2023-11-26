package Ch06_Methods;

public class Ex5_ReturnIntPlusDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println(x + y); // 20
        System.out.println(x + " " + y); // 10 10

        System.out.println(getNumber() + getNumber() + getNumber()); // 45
        System.out.println(getNumber() + " " + getNumber()); // 15 15
    }

    public static int getNumber() {
        return 15;
    }

}