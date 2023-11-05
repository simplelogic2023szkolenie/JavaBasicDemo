package Ch5_Arrays;

public class Ex2_ArrayInit {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 123, 6666, -56};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + " is " + numbers[i]);
        }

    }
}
