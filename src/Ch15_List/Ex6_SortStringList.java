package Ch15_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex6_SortStringList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Wojtek", "Asia", "Basia");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

    }
}
