package Ch5_Arrays;

public class Ex3_ArrayBeforeFillDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            if (i % 3 == 0) {
                numbers[i] = 333;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + " is " + numbers[i]);
        }

    }
}
