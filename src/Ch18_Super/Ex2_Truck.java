package Ch18_Super;

public class Ex2_Truck extends Ex2_Vehicle {
    private int maxLoad;
    public Ex2_Truck(String name, int maxSpeed, int maxLoad) {
        super(name, maxSpeed);
        this.maxLoad = maxLoad;
    }
}
