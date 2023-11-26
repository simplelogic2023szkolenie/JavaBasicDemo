package Ch03_Swtich;

public class Ex1_SwtichIntDemo {
    public static void main(String[] args) {
        int number = 1; // na potrzeby testowania mozna zmieniać te wartoci na inne

        switch (number) {
            case 1:
                System.out.println("wartość to 1");
                break;
            case 2:
                System.out.println("wartosc to 2");
                break;

            default:
                System.out.println("zadne z powyzszych nie zostalo spelnione");
                break;
        }
        System.out.println("Koniec programu");
    }
}
