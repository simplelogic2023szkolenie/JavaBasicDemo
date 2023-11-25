package Ch6_Methods;

public class Ex8_MethodParameters {
    public static void main(String[] args) {
        int a = 10;
        int x = 15;

        System.out.println(add(a,x));
        System.out.println(add(a,123));
        System.out.println(add(1,1));
    }

    public static int add(int a, int b){
        return a+b;
    }
}
