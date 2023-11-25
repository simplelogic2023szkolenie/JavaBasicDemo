package Ch6_Methods;

public class Ex1_MethodsIntro {
    public static void sayHello(){
        System.out.println("Im inside of method sayHello, Hello!!");
    }
    public static void main(String[] args) {
        System.out.println("START");
        sayWelcome();
        sayWelcome();
        sayHello();
        System.out.println("END");
    }

    public static void sayWelcome(){
        System.out.println("Im inside of sayWelcome method, Welcome!!");
    }
}
