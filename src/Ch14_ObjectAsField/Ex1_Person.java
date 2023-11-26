package Ch14_ObjectAsField;

public class Ex1_Person {
    public Ex1_Person(String firstName, String lastName, int age, Ex1_Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String firstName;
    public String lastName;
    public int age;
    public Ex1_Address address;


    public String getPersonData() {
        return firstName + " " + lastName + " wiek: " + age + " address: " + address.getAddressData();
    }
}
