package Ch15_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex6_SortBook {
    public static void main(String[] args) {
        List<Ex5_Book> library = new ArrayList<>();
        library.add(new Ex5_Book("www", "x", 2000));
        library.add(new Ex5_Book("zzz", "x", 1900));
        library.add(new Ex5_Book("ccc", "x", 2000));
        library.add(new Ex5_Book("ddd", "x", 1900));
        library.add(new Ex5_Book("xxx", "x", 1900));


        System.out.println("bez sortowania");
        System.out.println(library);

        System.out.println("\nsortowanie po latach");
        Collections.sort(library, Comparator.comparingInt(o -> o.yearOfPublication));
        System.out.println(library);


        System.out.println("\nsortowanie po latach, a nastepnie po title");
        Collections.sort(library, Comparator.comparingInt(o -> o.yearOfPublication)
                .thenComparing(b -> b.title,));
        System.out.println(library);

    }
}
