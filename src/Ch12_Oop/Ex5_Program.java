package Ch12_Oop;

public class Ex5_Program {
    public static void main(String[] args) {
        Ex5_Car ford = new Ex5_Car(120, "blue");
        System.out.println(ford.color);
        ford.drive();

        Ex5_Car audi = new Ex5_Car(200, "red");
        System.out.println(audi.color);
        audi.drive();
    }
}
