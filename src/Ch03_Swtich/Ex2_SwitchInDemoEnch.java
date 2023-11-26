package Ch03_Swtich;

public class Ex2_SwitchInDemoEnch {
    public static void main(String[] args) {
        int number = 1; // na potrzeby testowania mozna zmieniać te wartoci na inne

        switch (number) {
            case 1 -> System.out.println("wartość to 1");
            case 2 -> System.out.println("wartosc to 2");
            default -> System.out.println("zadne z powyzszych nie zostalo spelnione");
        }
        System.out.println("Koniec programu");
    }
}

