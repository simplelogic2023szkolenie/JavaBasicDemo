package Ch15_List;


import java.util.ArrayList;
import java.util.List;

public class Ex1_ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Asia");
        names.add("Basia");
        names.add("Krzysiek");
        names.add("Wojtek");

        System.out.println("Rozmiar listy to: " + names.size());

        names.remove("Asia");
        System.out.println("Rozmiar listy to: " + names.size());

        names.remove(1);
        System.out.println("Rozmiar listy to: " + names.size());

        String first = names.get(0);
        System.out.println("Pierwszy element listy to: " + first);

        // dla listy string można wypisać jako:
        System.out.println(names);

        // mozna też foreach
        for(String name: names){
            System.out.println(">> " + name + " << ");
        }
    }
}
