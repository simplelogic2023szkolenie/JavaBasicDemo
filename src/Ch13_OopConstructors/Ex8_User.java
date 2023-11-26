package Ch13_OopConstructors;

public class Ex8_User {
    // tutaj rejestracja usera samodzielna podczas wejsca na strone
    public Ex8_User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    // tutaj rejestracja usera wymuszona przez aplikacje, przy probie zakupie poroduktow jako gość
    public Ex8_User(String userName, String password, String email, String firstName, String lastName, String adress, String zipcode) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.zipcode = zipcode;
    }

    String userName;
    String password;
    String email;

    String firstName;
    String lastName;
    String adress;
    String zipcode;
}




