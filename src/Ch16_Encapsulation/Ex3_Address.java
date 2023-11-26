package Ch16_Encapsulation;

public class Ex3_Address {
    public Ex3_Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    private String street;
    private int number;

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }
}
