package Ch3_Swtich;

public class Ex3_SwitchStringDemo {
    public static void main(String[] args) {
        String name = "Sylwia"; // na potrzeby testowania mozna zmieniać te tekst na inny

        switch (name) {
            case "Mateusz":
                System.out.println("Witaj Mateusz");
                break;
            case "Karol":
                System.out.println("Witaj Karol");
                break;
            default:
                System.out.println("O a Ciebie nie znałem " + name);
                break;
        }
        System.out.println("Koniec programu");
    }
}
