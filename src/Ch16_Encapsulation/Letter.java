package Ch16_Encapsulation;

import java.util.List;

public class Letter {

    public Letter(Person sender, List<Person> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
    }

    private Person sender;
    private List<Person> recipients;
    private String content;
}
