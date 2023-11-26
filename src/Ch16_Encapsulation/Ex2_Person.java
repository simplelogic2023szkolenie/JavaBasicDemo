package Ch16_Encapsulation;

public class Ex2_Person {
    public Ex2_Person(String firstName, String lastName, int age, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private String firstName; // nizej jest setter i getter
    private String lastName; // nizej jest setter i getter
    private int age; // nizej jest setter i getter
    private int pesel; // nizej jest tylko sam getter

    public int getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("sry ale to jest nipoprawna wartość " + age);
        }
    }
}
