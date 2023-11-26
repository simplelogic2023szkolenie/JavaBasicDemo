package Ch04_Loops;

public class Ex10_DoWhileCombinations {
    public static void main(String[] args) {
        int i = 0;

        // do-while wykona się zawsze przynajmnie raz
        // poniewaz najpierw wykonujemy pierwsza interacje
        // a na koncu dopiero sprawdzamy warunek
        do {
            System.out.println(i);
            i++;
        } while (i > 10);

    }
}
