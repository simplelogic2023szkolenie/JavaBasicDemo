package Ch05_Arrays;

public class Ex6_ArraysForEach {
    public static void main(String[] args) {

        int[] numbers = {1, 435, 123, 678, 636};

        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Mat", "Carol", "Sylvie"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
