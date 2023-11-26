package Ch14_ObjectAsField;

public class Ex2_Engine {
    public int horsePower;
    public int maxSpeed;

    public Ex2_Engine(int horsePower, int maxSpeed) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }
    public String getEngineData(){
        return "horsePower: " +horsePower + " maxSpeed: " + maxSpeed;
    }

}
