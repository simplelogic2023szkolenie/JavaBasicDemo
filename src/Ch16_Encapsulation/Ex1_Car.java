package Ch16_Encapsulation;

public class Ex1_Car {

    private int horsePower;
    private String color;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {
        System.out.println("Driving using: " + horsePower + "HP");
    }
}

