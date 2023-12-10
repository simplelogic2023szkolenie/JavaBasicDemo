package Ch20_25_Extras.Ch20_AbsctractClass;

public class Dog extends Animal{
    private int clawsLenght;

    public Dog(String name, int clawsLenght) {
        super(name);
        this.clawsLenght = clawsLenght;
    }

    public int getClawsLenght() {
        return clawsLenght;
    }

    public void setClawsLenght(int clawsLenght) {
        this.clawsLenght = clawsLenght;
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}
