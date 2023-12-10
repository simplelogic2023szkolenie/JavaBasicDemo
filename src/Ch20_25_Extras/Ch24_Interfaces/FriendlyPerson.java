package Ch20_25_Extras.Ch24_Interfaces;

public class FriendlyPerson extends Person implements Thankable, Greetable {
    public FriendlyPerson(String name) {
        super(name);
    }

    @Override
    public void introduce(  ) {
        System.out.println("nazwywam się:" + getName());
    }

    @Override
    public void greet() {
        System.out.println("Cześć miło Ciebie poznać");
    }

    @Override
    public void thank() {
        System.out.println("Dzięki wielkiie za spotkanie");
    }
}
