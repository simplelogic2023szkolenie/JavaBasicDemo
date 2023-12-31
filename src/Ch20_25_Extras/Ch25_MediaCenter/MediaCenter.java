package Ch20_25_Extras.Ch25_MediaCenter;

public class MediaCenter {
    public static void main(String[] args) {
        Radio radio = new Radio();
        SmartPhone smartPhone = new SmartPhone();
        Billboard billboard = new Billboard();

        useMusicPlayer(radio);
        useMusicPlayer(smartPhone);

        useMessageDisplay(smartPhone);
        useMessageDisplay(billboard);
    }

    static void useMusicPlayer(MusicPlayer player){
        player.playMusic();
    }

    static void useMessageDisplay(MessageDisplay display){
        display.displayMessage();
    }
}
/**
 * 1. Definicja Interfejsów:
 * - Utwórz interfejs `MusicPlayer` z metodą `void playMusic();`.
 * - Utwórz interfejs `MessageDisplay` z metodą `void displayMessage();`.
 * <p>
 * 2. Implementacja Klas:
 * - Utwórz klasę `Radio`, która implementuje tylko interfejs `MusicPlayer`.
 * - Utwórz klasę `Billboard`, która implementuje tylko interfejs `MessageDisplay`.
 * - Utwórz klasę `SmartPhone`, która implementuje oba interfejsy: `MusicPlayer` i `MessageDisplay`.
 * <p>
 * 3. Klasa Programu:
 * - Utwórz klasę `MediaCenter` z metodą `main()`.
 * - W `main()`, utwórz obiekty `Radio`, `Billboard` i `SmartPhone`.
 * - Dodaj metody `static void useMusicPlayer(MusicPlayer player)` i `static void useMessageDisplay(MessageDisplay display)`,
 * które wywołują odpowiednie metody z przekazanych obiektów.
 * - Przekaż obiekty `Radio` i `SmartPhone`, do metody useMusicPlayer()
 * - Przekaż obiekty `Billboard` i `SmartPhone` do metody useMessageDisplay()
 * <p>
 * sprawdź czy poporwnie dane wypisały się do konsoli
 */