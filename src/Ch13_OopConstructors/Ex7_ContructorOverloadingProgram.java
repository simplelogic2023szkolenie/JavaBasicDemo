package Ch13_OopConstructors;

public class Ex7_ContructorOverloadingProgram {
    public static void main(String[] args) {
        Ex7_Bike cross = new Ex7_Bike();
        cross.weight = 10;
        cross.color = "red";
        cross.brand = "cross";

        Ex7_Bike bmx = new Ex7_Bike("bmx", "black", 15);

        Ex7_Bike unknown = new Ex7_Bike("yellow", 11);

        Ex7_Bike noWeight = new Ex7_Bike("bmx", "yellow");
    }
}
