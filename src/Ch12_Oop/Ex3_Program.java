package Ch12_Oop;

public class Ex3_Program {
    public static void main(String[] args) {
        Ex3_Car car = new Ex3_Car();
        System.out.println(car.color);
        System.out.println(car.horsePower);

        car.color = "blue";
        car.horsePower = 123;
        System.out.println(car.color);
        System.out.println(car.horsePower);

        car.setColor("RED");
        car.setHorsePower(500);
        System.out.println(car.color);
        System.out.println(car.horsePower);
    }
}
