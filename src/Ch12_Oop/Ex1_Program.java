package Ch12_Oop;

public class Ex1_Program {
    public static void main(String[] args) {
        Ex1_Car ford = new Ex1_Car();
        ford.horsePower = 120;
        ford.color = "blue";

        Ex1_Car audi = new Ex1_Car();
        audi.color= "red";
        audi.horsePower= 200;

        System.out.println("ford:");
        System.out.println(ford.horsePower);
        System.out.println(ford.color);
        ford.drive();

        System.out.println("audi:");
        System.out.println(audi.horsePower);
        System.out.println(audi.color);
        audi.drive();
    }
}
