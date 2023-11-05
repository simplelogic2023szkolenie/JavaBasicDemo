package Ch5_Arrays;

public class Ex1_ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + " is " + numbers[i]);
        }

    }
}
