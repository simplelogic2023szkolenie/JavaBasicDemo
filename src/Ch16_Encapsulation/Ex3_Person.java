package Ch16_Encapsulation;

public class Ex3_Person {
    public Ex3_Person(String firstName, String lastName, Ex3_Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    private String firstName;
    private String lastName;
    private Ex3_Address address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Ex3_Address getAddress() {
        return address;
    }
}
