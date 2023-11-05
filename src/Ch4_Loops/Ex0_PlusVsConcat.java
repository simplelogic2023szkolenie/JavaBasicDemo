package Ch4_Loops;

public class Ex0_PlusVsConcat {
    public static void main(String[] args) {
        // to nie jest ćwiczenia i tylko info dla chętnych, można pominąć przy nauce

        String text = "World";
        int number = 10;
        System.out.println(text+number);

        // poniższe zakomentowane ponieważ byłby błąd kompilacji
//        System.out.println(text.concat(number));

        String s1 = null;
        String s2 = "World";
        System.out.println(s1 + s2);
        // poniższy kod wyrzuca wyjątek:
        System.out.println(s1.concat(s2));
    }
}
