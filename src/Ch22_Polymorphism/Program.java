package Ch22_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat filemon = new Cat("filemon");
        Dog reksio = new Dog("reksio");
        Dog szrik = new Dog("szrik");

        List<Animal> animals = new ArrayList<>();

        filemon.jump();
        reksio.eat();

        animals.add(filemon);
        animals.add(reksio);
        animals.add(szrik);

        for(Animal animal : animals){
            animal.makeSound();
        }

        System.out.println("==========");
        executeSound(filemon);
        executeSound(reksio);
    }

    private static void executeSound(Animal animal){
        System.out.println("uruchiam metode make sound!");
        animal.makeSound();
    }
}
