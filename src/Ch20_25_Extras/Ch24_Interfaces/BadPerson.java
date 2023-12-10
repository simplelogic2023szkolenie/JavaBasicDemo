package Ch20_25_Extras.Ch24_Interfaces;

public class BadPerson extends Person implements Greetable{

    public BadPerson(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("czego chcesz?");
    }

    @Override
    public void introduce() {
        System.out.println("nie bede sie przedstawiać");
    }
}
