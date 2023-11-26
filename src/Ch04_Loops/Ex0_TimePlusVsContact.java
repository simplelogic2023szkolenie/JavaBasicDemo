package Ch04_Loops;

public class Ex0_TimePlusVsContact {
    public static void main(String[] args) {
        // to nie jest ćwiczenia i tylko info dla chętnych, można pominąć przy nauce

        final int ITERATIONS = 1_000_000;
        String s1 = "asd";
        String s2 = "World";

        // Pomiar czasu dla operatora +
        long startTimePlus = System.nanoTime();
        String resultPlus = "";
        for (int i = 0; i < ITERATIONS; i++) {
            resultPlus = s1 + s2;
        }
        long endTimePlus = System.nanoTime();
        long durationPlus = (endTimePlus - startTimePlus) / 1_000_000;  // w milisekundach

        // Pomiar czasu dla metody concat
        long startTimeConcat = System.nanoTime();
        String resultConcat = "";
        for (int i = 0; i < ITERATIONS; i++) {
            resultConcat = s1.concat(s2);
        }
        long endTimeConcat = System.nanoTime();
        long durationConcat = (endTimeConcat - startTimeConcat) / 1_000_000;  // w milisekundach

        System.out.println("Czas używając +: " + durationPlus + "ms");
        System.out.println("Czas używając concat: " + durationConcat + "ms");

    }
}
