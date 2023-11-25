package Ch11_Recursion;

public class Ex1_RecursionDemo {
    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int n){
        if(n>0){
            printNumbers(n-2);
            System.out.println(n);
        }
    }
}
