package Ch14_ObjectAsField;

public class Vehicle {
    public Vehicle(String brand, int yearOfProduction, Engine engine) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public String brand;
    public int yearOfProduction;
    public Engine engine;

    public String getVehicleData() {
        return "brand: " + brand + " yearOfProduction: " + yearOfProduction + " engine: " + engine.getEngineData();
    }

}
