package Ch12_Oop;

public class Ex5_Car {

    public Ex5_Car(int horsePower, String color) {
        this.horsePower = horsePower;
        this.color = color;
    }

    public int horsePower;
    public String color;

    public void drive() {
        System.out.println("Driving using: " + horsePower + "HP");
    }
}
