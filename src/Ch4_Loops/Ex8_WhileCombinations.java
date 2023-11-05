package Ch4_Loops;

public class Ex8_WhileCombinations {
    public static void main(String[] args) {
        int i = 0;

        // ta petna nie wykona się ani razu
        while (i>10){
            System.out.println(i);
            i++;
        }

        // a tutaj w nieskończoność
        while (true){
            System.out.println("hej!");
        }
    }
}
