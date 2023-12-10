package Ch22_Polymorphism;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meaow meaow");
    }

    public void jump(){
        System.out.println("jump");
    }
}
