package Ch16_Encapsulation;

public class Ex2_Program {
    public static void main(String[] args) {
        Ex2_Person person = new Ex2_Person("Mateusz", "Tadla", 32, 987123987);

        person.setLastName("Kowalski");
        person.setAge(-2);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.getPesel());
    }
}
