package Ch05_Arrays;

public class Ex4_ArrayBeforeFillDemo {
    public static void main(String[] args) {
        String[] numbers = new String[10];

        for (int i = 0; i < numbers.length; i++) {
            if (i % 3 == 0) {
                numbers[i] = "Mateusz";
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + " is " + numbers[i]);
        }

    }
}
