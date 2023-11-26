package Ch15_List;

import java.util.Arrays;

public class Ex6_SortStringArray {
    public static void main(String[] args) {
        String[] names = {"Wojtek ", "Asia ", "Basia "};
        for (String name : names) {
            System.out.print(name);
        }


        System.out.println();
        Arrays.sort(names);

        for (String name : names) {
            System.out.print(name);
        }
    }
}
