package Ch12_Oop;

public class Ex4_Animal {
    public String name;
    public int age;

    public void setValues(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Imie zwierzaka to: " + name + ", wiek: " + age);
    }
}
