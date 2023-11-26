package Ch14_ObjectAsField;

public class Ex1_Address {
    public Ex1_Address(int zipCode, String city, String street, int houseNumber) {
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int zipCode;
    public String city;
    public String street;
    public int houseNumber;

    public String getAddressData() {
        return zipCode + " " + city + " " + street + " " + houseNumber;
    }
}
