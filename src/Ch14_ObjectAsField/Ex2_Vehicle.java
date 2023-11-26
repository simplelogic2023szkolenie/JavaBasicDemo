package Ch14_ObjectAsField;

public class Ex2_Vehicle {
    public Ex2_Vehicle(String brand, int yearOfProduction, Ex2_Engine engine) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public String brand;
    public int yearOfProduction;
    public Ex2_Engine engine;

    public String getVehicleData() {
        return "brand: " + brand + " " + yearOfProduction
                + " engine: " + engine.getEngineData();
    }

}
