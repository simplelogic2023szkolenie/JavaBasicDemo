package Ch15_List;

import java.util.ArrayList;
import java.util.List;

public class Ex3_SimplePrintList {
    public static void main(String[] args) {
        List<Ex3_Person> people = new ArrayList<>();

        Ex3_Person jan = new Ex3_Person("jan", 20);
        Ex3_Person adam = new Ex3_Person("adam", 30);

        people.add(jan);
        people.add(adam);


        System.out.println("opcja z for each");
        for (Ex3_Person person : people) {
            System.out.println(person.getPersonData());
        }

        System.out.println("opcja ze standordową pętlą for ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getPersonData());
        }

    }
}
