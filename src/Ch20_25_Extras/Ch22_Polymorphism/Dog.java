package Ch20_25_Extras.Ch22_Polymorphism;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " woof woof");
    }

    public void eat(){
        System.out.println("eating");
    }
}
