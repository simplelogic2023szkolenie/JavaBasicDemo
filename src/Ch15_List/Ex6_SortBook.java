package Ch15_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex6_SortBook {
    public static void main(String[] args) {
        List<Ex5_Book> library = new ArrayList<>();
        library.add(new Ex5_Book("www", "x", 2000));
        library.add(new Ex5_Book("zzz", "x", 1900));
        library.add(new Ex5_Book("ccc", "x", 2000));
        library.add(new Ex5_Book("ddd", "x", 1900));
        library.add(new Ex5_Book("xxx", "x", 1900));


        System.out.println(library);

        Collections.sort(library, (o1, o2) -> Integer.compare(o1.yearOfPublication, o2.yearOfPublication));
        System.out.println(library);

    }
}
