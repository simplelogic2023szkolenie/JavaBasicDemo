package Ch7_MethodsWithParameters;

public class Ex1_MethodParameters {
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
