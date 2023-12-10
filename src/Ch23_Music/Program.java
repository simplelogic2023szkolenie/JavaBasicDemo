package Ch23_Music;

public class Program {
    public static void main(String[] args) {

    }
}


/*

1. Klasa Bazowa `Music`:
   - Utwórz abstrakcyjną klasę `Music`.
   - Zdefiniuj w niej abstrakcyjną metodę `play()`.

2. Klasy Pochodne:
   - Utwórz klasy `Techno`, `Classic`, `Pop`. Każda z tych klas powinna dziedziczyć po klasie `Music`.
   - Zaimplementuj metodę `play()` w każdej z klas pochodnych, tak aby odpowiadała charakterystyce danego gatunku muzycznego.


W klasie Program z metoda main()
3. Metoda Przyjmująca Obiekty Klasy Bazowej:
   - Utwórz metodę, np. `playMusic(Music music)`, która będzie przyjmować obiekt klasy `Music` i wywoływać jego metodę `play()`.

4. Przechowywanie Obiektów w Liście Bazowej:
   - Utwórz listę typu `Music`.
   - Dodaj do niej instancje `Techno`, `Classic`, `Pop`.
   - Iteruj przez listę i dla każdego elementu wywołaj metodę `playMusic()`.


 */