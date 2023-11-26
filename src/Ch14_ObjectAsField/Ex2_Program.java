package Ch14_ObjectAsField;

public class Ex2_Program {
    public static void main(String[] args) {

    }
}


/*
stworz klase Engine:
 - pole int horsePower
 - pole int maxSpeed
 - konstruktor
  - metode String getEngineData() -> na zwacac horsePower maxSpeed


 stworz klase Vehicle:
 - pole String brand
 - pole int yearOfProduction
 - pole Engine engine
  - konstruktor
  - metode String getVehicleData() -> ma zwacac brand yearOfProduction engine.getEngineData()

 stwórz klase Program z metoda main()
 - stwórz 2 obiekty klasy Engine
 - stwórz 3 obiekty klasy Vehicle -> użyj obiektów klasy Enine do konstroka Engine

 na obiektach klasy Engine uruchom System.out.prinlt(xxxxx.getVehicleData())

 */