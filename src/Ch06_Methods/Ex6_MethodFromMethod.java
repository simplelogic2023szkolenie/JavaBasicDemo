package Ch06_Methods;

public class Ex6_MethodFromMethod {
    public static void main(String[] args) {
        int x = getNumber();
        System.out.println(x);
        SayHello();
    }

    public static void SayHello() {
        System.out.println("Hello!!!!!!");
        Goodbye();
        System.out.println("end of say hello method");
    }

    public static int getNumber() {
        System.out.println("Im inside getNumber");
        SayHello();
        return 15;
    }

    public static void Goodbye() {
        System.out.println("Goodbye!!");
    }
}