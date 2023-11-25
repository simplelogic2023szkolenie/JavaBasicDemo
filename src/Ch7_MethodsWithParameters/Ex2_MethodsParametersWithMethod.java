package Ch7_MethodsWithParameters;

public class Ex2_MethodsParametersWithMethod {
    public static void main(String[] args) {
//        int x = add(1,3);
//        int y = add(44,5);
//        System.out.println(add(x,y));

        System.out.println(add(add(1,3),add(44,5)));
    }

    public static int add(int a, int b){
        return a+b;
    }
}
