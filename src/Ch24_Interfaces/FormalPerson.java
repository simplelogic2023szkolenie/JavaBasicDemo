package Ch24_Interfaces;

public class FormalPerson extends Person implements Greetable, Thankable {
    public FormalPerson(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Dzień dobry, miło Pana/Panią poznać,");
    }

    @Override
    public void introduce() {
        System.out.println("jestem " + getName());
    }

    @Override
    public void thank() {
        System.out.println("dziekuje bardzo za spotkanie");
    }
}
