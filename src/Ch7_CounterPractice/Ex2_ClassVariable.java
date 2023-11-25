package Ch7_CounterPractice;

public class Ex2_ClassVariable {
    static int numberInClass;
    public static void main(String[] args) {
        int number = 15;
        numberInClass = 5;
        update();
        System.out.println("main numberInClass " + numberInClass);
        System.out.println("main number " + number);
    }

    public static void update() {
        numberInClass = 7;
        int number = 25;
        System.out.println("update numberInClass: " + numberInClass);
        System.out.println("update number: " + number);
    }
}
