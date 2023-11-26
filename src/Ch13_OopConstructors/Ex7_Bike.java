package Ch13_OopConstructors;

public class Ex7_Bike {
    public Ex7_Bike() {
    }

    public Ex7_Bike(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Ex7_Bike(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Ex7_Bike(String brand, String color, int weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public String brand;
    public String color;
    public int weight;

}
