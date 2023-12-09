package Ch18_Super;

public class SpeedTruck extends Ex2_Truck{
    private String engineType;

    public SpeedTruck(String name, int maxSpeed, int maxLoad, String engineType) {
        super(name, maxSpeed, maxLoad);
        this.engineType = engineType;
    }
}
