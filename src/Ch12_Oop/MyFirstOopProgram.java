package Ch12_Oop;

public class MyFirstOopProgram {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.horsePower = 120;
        ford.color = "blue";

        Car audi = new Car();
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
