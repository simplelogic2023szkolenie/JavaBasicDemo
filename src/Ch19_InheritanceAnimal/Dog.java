package Ch19_InheritanceAnimal;

public class Dog extends Animal {
    private int height;

    public Dog(String name, int height) {
        super(name);
        this.height = height;
    }

    public void bark() {
        System.out.println("woof woof!");
    }

    public void introduce() {
        System.out.println("I'm dog, my  name is " + getName() + " and I have " + height + " height");
    }
}
