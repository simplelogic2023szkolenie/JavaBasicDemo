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

        Eagle eagle = new Eagle("egle", 50, 5);

        System.out.println(eagle.getClawsLegth());

        Pinquin pinquin = new Pinquin("pingu", 50, 30);
        System.out.println(pinquin.getSwimmingSpead());
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
 * <p>
 * Utwórz klasę Eagle (wraz z konstruktorem) dziedziczącą po Bird zawierającą:
 * Pole: int clawsLegth
 * Konstruktor nie powinien przyjmować parametru canFly i w konstrukcji super() mieć 'zahardkodowaną' wartoś true
 * <p>
 * Utwórz klasę Pinquin (wraz z konstruktorem) dziedziczącą po Bird zawierającą:
 * Pole: int swimmingSpead
 * Konstruktor nie powinien przyjmować parametru canFly i w konstrukcji super() mieć 'zahardkodowaną' wartoś false
 * <p>
 * <p>
 * W klasie z metodą main() stwórz obiekt klasy Eagle oraz Pinquin  i uruchom na nich metody eat(), introduce(), fly() oraz wypisz clawsLegth dla orła i dla swimmingSpead pingwina
 **/
