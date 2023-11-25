package Ch12_Oop;

public class Ex2_Employee {
    public String firstName;
    public String lastName;
    public int age;

    public void printEmployeeInfo() {
        System.out.println(firstName + " " + lastName + " " + age);
    }

    public String getEmployeeInfo() {
        return firstName + " " + lastName + " " + age;
    }
}
