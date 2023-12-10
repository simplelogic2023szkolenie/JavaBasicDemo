package Ch20_25_Extras.Ch24_Interfaces;

public class Program {

    public static void main(String[] args) {
        FormalPerson formalPerson = new FormalPerson("Karol");
        FriendlyPerson friendlyPerson= new FriendlyPerson("Mat");
        BadPerson badPerson = new BadPerson("Hilary");

        letsGreet(formalPerson);
        letsGreet(friendlyPerson);
        letsGreet(badPerson);

        letsThank(formalPerson);
        letsThank(friendlyPerson);
        // nie można użyć ponizszej linijki, dlatego że
        // klasa BadPerson nie implementuje intefejsu Thankable
        // letsThank(badPerson);
    }

    public static void letsGreet(Greetable greetable){
        greetable.introduce();
        greetable.greet();
    }


    public static void letsThank(Thankable thankable){
        thankable.thank();
    }
}
