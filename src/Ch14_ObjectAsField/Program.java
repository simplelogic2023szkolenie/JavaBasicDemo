package Ch14_ObjectAsField;

public class Program {
    public static void main(String[] args) {
        Engine dieselEngine = new Engine(130,200);
        Engine petrolEngine = new Engine(180, 240);

        Vehicle toyota = new Vehicle("toyota", 2020, dieselEngine);
        Vehicle honda = new Vehicle("Honda", 2018, petrolEngine);
        Vehicle bmw = new Vehicle("BMW", 2021, dieselEngine);

        System.out.println(toyota.getVehicleData());
        System.out.println(honda.getVehicleData());
        System.out.println(bmw.getVehicleData());

        dieselEngine.horsePower=400;
        dieselEngine.maxSpeed=320;

        System.out.println("\nPo zmianie danych silnie diesel");
        System.out.println(toyota.getVehicleData());
        System.out.println(honda.getVehicleData());
        System.out.println(bmw.getVehicleData());
    }
}
