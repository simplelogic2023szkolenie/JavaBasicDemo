package Ch15_List;

import java.util.*;

public class Ex5_Library {
    public List<Ex5_Book> booksCollection = new ArrayList<>();

    public void addBook(Ex5_Book book){
        System.out.println("dodaje książke do bibiloteki o nazwie: " + book.title);
        booksCollection.add(book);
    }

    public void printBooksAfterDate(int year){

        for(Ex5_Book book : booksCollection){
            if(book.yearOfPublication > year){
                // titaj zadziała poprostu System.out.println(book)
                // ponieważ zrobiliśmy @override na toString()
                // więc java wie jak zamienić obiekt klasy Book na
                // reprezentatywny kawałek tekstu
                System.out.println(book);
            }
        }
    }

}
