package Ch20_AbsctractClass;

public class Bird extends Animal{
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }


    @Override
    public void makeSound() {
        System.out.println("tweet tweet");
    }
}
