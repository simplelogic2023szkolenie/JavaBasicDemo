package Ch15_List;

public class Ex5_Program {
    public static void main(String[] args) {
        Ex5_Library library = new Ex5_Library();

        Ex5_Book book1 = new Ex5_Book("1984", "George Orwell", 1949);
        Ex5_Book book2 = new Ex5_Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Ex5_Book book3 = new Ex5_Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Ex5_Book book4 = new Ex5_Book("One Hundred Years of Solitude", "Gabriel García Márquez", 1967);
        Ex5_Book book5 = new Ex5_Book("A Brief History of Time", "Stephen Hawking", 1988);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // tutaj opcja dodania książki do razu do listy, bez wcześniego zapiswania do zmiennej
        library.addBook(new Ex5_Book("Dziady", "Adam Mickiewicz", 1822));

        library.printBooksAfterDate(1930);

    }
}
/**
 * Zadanie: System Zarządzania Biblioteką
 *
 * Cel Zadania:
 * Stwórz klasę 'Library', która będzie zarządzać książkami (obiektami klasy 'Book').
 * Biblioteka powinna umożliwiać dodawanie książek do zbioru oraz wyświetlanie informacji o książkach.
 *
 * Kroki:
 *
 * 1. Stwórz Klasę 'Book':
 *    - Zdefiniuj w niej trzy pola: 'String title', 'String author' i 'int yearOfPublication'. + konstruktor
 *    - utwórz metodę która drukuje informacje o danej książce np. printBookInfo()
 *
 * 2. Stwórz Klasę 'Library':
 *    - Zdefiniuj w niej pole, które będzie listą książek (np. 'List<Book> booksCollection = new ArrayList<>();').
 *    tutaj nie potrzebuje konstruktoea
 *
 *    - Utwórz metodę do dodawania nowej książki do zbioru (np. 'addBook(Book book)')
 *         która doda przekazana w parametrze książke do listy booksCollection
 *    - Utwórz metodę printBooksAfterDate(int year), metoda ta powinna wydrukować informacje o ksiażkach,
 *         które zostały wydane po roku przekazanym w parametrze year
 *
 * 5. Utwórz logikę w klasie Program:
 *    - W metodzie 'main' utwórz obiekt 'Library'.
 *    - stwórz 5 obiektów klasy Book
 *    - Dodaj te książki do biblioteki.
 *    - Wywołaj printBooksAfterDate() i przekaż do niej datę aby tylko część z książek została wyświetlona
 */