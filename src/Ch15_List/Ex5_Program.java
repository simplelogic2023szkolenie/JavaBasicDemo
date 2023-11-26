package Ch15_List;

public class Ex5_Program {
    public static void main(String[] args) {

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
 *    - Zdefiniuj w niej pole, które będzie listą książek (np. 'public List<Book> booksCollection = new ArrayList<>();').
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