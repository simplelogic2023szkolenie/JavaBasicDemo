package Ch15_List;

public class Ex2_PersonWithToString {
    public String name;
    public int age;

    public Ex2_PersonWithToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
