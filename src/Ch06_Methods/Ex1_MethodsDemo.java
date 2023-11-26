package Ch06_Methods;

public class Ex1_MethodsDemo {
    public static void sayHello() {
        System.out.println("Im inside of method sayHello, Hello!!");
    }

    public static void main(String[] args) {
        System.out.println("START");
        sayWelcome();
        sayWelcome();
        sayHello();
        // poniższy kod nie zadziała ponieważ metoda nie jest statyczna
//        sayWelcomeWithoutStaticWord();
        System.out.println("END");
    }

    public void sayWelcomeWithoutStaticWord() {
        System.out.println("Im inside of sayWelcome method, Welcome!!");
    }

    public static void sayWelcome() {
        System.out.println("Im inside of sayWelcome method, Welcome!!");
    }
}
