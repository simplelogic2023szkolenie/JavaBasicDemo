package Ch19_InheritanceAnimal;

public class Program {
    public static void main(String[] args) {
        Dog pluto = new Dog("pluto", 50);
        Bird tweety = new Bird("tweety", 15, true);

        pluto.introduce();
        pluto.bark();
        pluto.eat();


        tweety.introduce();
        tweety.fly();
        tweety.eat();
    }
}


/**
 * Utwórz klasę Animal (wraz z konstruktorem) zawierającą:
 * pole: private String name
 * metodę public void eat() wypisującą text "I can eat"
 * oraz getter do pola name
 * <p>
 * Utwórz klasę Dog (wraz z konstruktorem – super() + inicjalizacja pola height) dziedziczącą po Animal zawierającą:
 * Pole: private int height
 * Metodę: void bark() wypisującą text "woof woof!" oraz metodę introduce() wypisującą text: "I'm dog, my  name is xxx and I have xxx height"
 * <p>
 * <p>
 * <p>
 * Utwórz klasę Bird (wraz z konstruktorem – super() + inicjalizacja pól wingspan i canFly) dziedziczącą po Animal zawierającą:
 * pola:
 * private int wingspan, private boolean canFly
 * metody:
 * public void introduce() wypisującą text: "I'm bird, my name is xxx and I have xxx wingspan"
 * public void fly() wypisującą text "I can fly!" dla canFly==true, a w przeciwnym razie "I can't fly"
 * <p>
 * W klasie Zoo z metodą main() stwórz  2 obiekty klasy Bird i uruchom na nich metody eat(), introduce(), oraz fly() oraz 2 obiekty klasy Dog i uruchom dla nich metody eat(), introduce() oraz bark()
 **/
