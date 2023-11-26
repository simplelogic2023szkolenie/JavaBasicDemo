package Ch14_ObjectAsField;

public class Ex2_Program {
    public static void main(String[] args) {

    }
}


/**
 *
 * 1. Klasa Engine (Silnik):
 *    - Atrybuty:
 *      - int horsePower - moc w koniach mechanicznych.
 *      - int maxSpeed - maksymalna prędkość.
 *    - Konstruktor: Tworzy instancję klasy Engine z odpowiednimi parametrami.
 *    - Metoda: String getEngineData()
 *      - Zadanie: Zwraca dane silnika w formacie: moc (horsePower) i maksymalna prędkość (maxSpeed).
 *
 * 2. Klasa Vehicle (Pojazd):
 *    - Atrybuty:
 *      - String brand - marka pojazdu.
 *      - int yearOfProduction - rok produkcji.
 *      - Engine engine - obiekt klasy Engine reprezentujący silnik pojazdu.
 *    - Konstruktor: Tworzy instancję klasy Vehicle z odpowiednimi parametrami.
 *    - Metoda: String getVehicleData()
 *      - Zadanie: Zwraca dane pojazdu w formacie: marka (brand), rok produkcji (yearOfProduction) oraz dane silnika uzyskane za pomocą engine.getEngineData().
 *
 * 3. Klasa Program z metodą main():
 *    - Zadanie:
 *      - Stwórz 2 obiekty klasy Engine:
 *        - Engine dieselEngine = new Engine(.......); // Silnik Diesla o mocy 130 KM i maks. prędkości 200 km/h
 *        - Engine petrolEngine = new Engine(......); // Silnik benzynowy o mocy 180 KM i maks. prędkości 240 km/h
 *      - Stwórz 3 obiekty klasy Vehicle:
 *        - Vehicle toyota = new Vehicle(.....); // Toyota z 2020 roku z silnikiem Diesla
 *        - Vehicle honda = new Vehicle(.....); // Honda z 2018 roku z silnikiem benzynowym
 *        - Vehicle bmw = new Vehicle(.....); // BMW z 2021 roku z silnikiem Diesla
 *      - Wyświetl informacje o pojazdach:
 *        - System.out.println(toyota.getVehicleData());
 *        - System.out.println(honda.getVehicleData());
 *        - System.out.println(bmw.getVehicleData());
 *
 *
 *        Zaktualizuje HP silika, który uzywasz dwukrotnie do stowrze 2 różnych obiektów klasy Vehicle
 *        np. dieselEngine.horsePower = 400;
 *        a następnie podnownie wyświetl dane o 3 pojazdach
 */
