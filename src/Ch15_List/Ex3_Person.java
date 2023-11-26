package Ch15_List;

public class Ex3_Person {
    public String name;
    public int age;

    public Ex3_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPersonData() {
        return name + " " + age;
    }
}
