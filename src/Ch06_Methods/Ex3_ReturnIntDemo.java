package Ch06_Methods;

public class Ex3_ReturnIntDemo {
    public static void main(String[] args) {
        System.out.println("START");
        shouldReturnSomeInt(); // tutaj nie zapisujemy zwracanej wartości
        int number = shouldReturnSomeInt();
        System.out.println(number);
        System.out.println("END");
    }

    public static int shouldReturnSomeInt() {
        System.out.println("im inside shouldReturnSomeInt method");
        return 15;
    }

}
