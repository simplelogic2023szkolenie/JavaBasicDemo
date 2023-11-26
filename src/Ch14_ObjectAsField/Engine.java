package Ch14_ObjectAsField;

public class Engine {
    public int horsePower;
    public int maxSpeed;

    public Engine(int horsePower, int maxSpeed) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }
    public String getEngineData(){
        return "horsePower: " +horsePower + " maxSpeed: " + maxSpeed;
    }

}
