package Ch27_HashMap;

import java.util.HashMap;

public class Ex3_ObjectAsValue {
    public static void main(String[] args) {
        Ch27_Person person1 = new Ch27_Person("a", "b", 1);
        Ch27_Person person2 = new Ch27_Person("c", "bew", 23);
        Ch27_Person person3 = new Ch27_Person("qwe", "zxc", 34);

        HashMap<Integer, Ch27_Person> people = new HashMap<>();

        people.put(1, person1);
        people.put(4, person2);
        people.put(77, person3);
        System.out.println(people);
    }
}
