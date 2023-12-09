package Ch19_InheritanceAnimal;

public class Bird extends Animal {
    private int wingspan;
    private boolean canFly;

    public Bird(String name, int wingspan, boolean canFly) {
        super(name);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public void fly() {
        if (canFly) {
            System.out.println("I can fly");
        } else {
            System.out.println("I can't fly");
        }
    }

    public void introduce() {
        System.out.println("I'm bird, my  name is " + getName() + " and I have " + wingspan + " wingspan");
    }
}
