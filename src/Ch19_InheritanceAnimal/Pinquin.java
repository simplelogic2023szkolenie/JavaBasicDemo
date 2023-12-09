package Ch19_InheritanceAnimal;

public class Pinquin extends Bird{
    public Pinquin(String name, int wingspan, int swimmingSpead) {
        super(name, wingspan, false);
        this.swimmingSpead = swimmingSpead;
    }

    private int swimmingSpead;

    public int getSwimmingSpead() {
        return swimmingSpead;
    }

    public void setSwimmingSpead(int swimmingSpead) {
        this.swimmingSpead = swimmingSpead;
    }
}
