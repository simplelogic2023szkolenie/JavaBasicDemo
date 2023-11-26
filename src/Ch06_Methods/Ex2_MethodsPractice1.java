package Ch06_Methods;

public class Ex2_MethodsPractice1 {
    public static void sayHello() {
        System.out.println("Im inside of method sayHello, Hello!!");
    }

    public static void main(String[] args) {
        sayWelcome();
        sayHello();
    }

    public static void sayWelcome() {
        System.out.println("Im inside of sayWelcome method, Welcome!!");
    }

    public static void sayGoodbye() {
        System.out.println("Bye!");
    }
}
/*
1. stworz 3 metody o dowolnych nazwach i drukujących dowolny tekst
2. w metodzie main uruchom 2 z tych 3 metod
3. uruchom program i sprawdz co zostało wydrukowane

 */