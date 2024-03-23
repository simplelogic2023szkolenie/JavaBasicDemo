package Ch27_HashMap;

public class Ch27_Person {
    private String firstName;
    private String lastName;
    private int age;

    public Ch27_Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ch27_Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
