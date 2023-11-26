package Ch13_OopConstructors;

public class Ex6_Program {
    public static void main(String[] args) {
        Ex6_Browser chrome = new Ex6_Browser("google", "chrome", 117);
        Ex6_Browser edge = new Ex6_Browser("ms", "edge", 120);

        System.out.println(chrome.getBroweserData());
        System.out.println(edge.getBroweserData());
    }
}


/*

Stwórz klasę Browser z polami:
String vendor
String name
int version

Utwórz w niej konstruktor inicjalizujący poszczególne pola.
Stwórz metodę getBrowerData(), która zwróci tekst zawierający dane przeglądarki: vendor, name oraz version

Stwórz klasie BrowserProgram wraz z metodą main(). Utwórz w niej 2 obiekty klasy Browser korzystając z kontruktora.
Następnie wydrukuj do konsoli tekst zwrócony przez metodę getBrowerData() dla każdego z tych obiektów.


 */
