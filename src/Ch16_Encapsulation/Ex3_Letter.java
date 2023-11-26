package Ch16_Encapsulation;

import java.util.List;

public class Ex3_Letter {

    public Ex3_Letter(Ex3_Person sender, List<Ex3_Person> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
    }

    private Ex3_Person sender;
    private List<Ex3_Person> recipients;
    private String content;


    public void send() {
        System.out.println("Letter from: " + getFormattedPersonData(sender));

        for (Ex3_Person person : recipients) {
            System.out.println("Letter to: " + getFormattedPersonData(person));
        }

        System.out.println("Content: " + content);
    }

    // implementacja z method chaining
    private String getFormattedPersonData(Ex3_Person person) {
        return "Imie: "
                + person.getFirstName()
                + ", nazwisko: "
                + person.getLastName()
                + ", adres: "
                + person.getAddress().getStreet()
                + " "
                + person.getAddress().getNumber();
    }


    // implementacja bez method chaining
    private String getFormattedPersonData2(Ex3_Person person) {
        Ex3_Address personAddress = person.getAddress();

        return "Imie: "
                + person.getFirstName()
                + ", nazwisko"
                + person.getLastName()
                + ", adres:"
                + personAddress.getStreet()
                + " "
                + personAddress.getNumber();
    }
}
