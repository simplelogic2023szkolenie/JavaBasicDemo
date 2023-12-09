package Ch16_Encapsulation;

public class Ex1_Program {
    public static void main(String[] args) {
        Ex1_Car ford = new Ex1_Car();
        ford.setHorsePower(120);
        ford.setColor("blue");


        ford.horsePower = 400;

        Ex1_Car audi = new Ex1_Car();
        audi.setColor("red");
        audi.setHorsePower(200);

        System.out.println("ford:");
        System.out.println(ford.getHorsePower());
        System.out.println(ford.getColor());
        ford.drive();

        System.out.println("audi:");
        System.out.println(audi.getHorsePower());
        System.out.println(audi.getColor());
        audi.drive();
    }
}
