package Ch14_ObjectAsField;

public class Ex1_OafProgram {
    public static void main(String[] args) {
        Ex1_Address lublin = new Ex1_Address(20800, "lublin", "3maja", 20);

        Ex1_Person janKowal = new Ex1_Person("Jan", "Kowal", 40, lublin);
        Ex1_Person mariaKowal = new Ex1_Person("Maria", "Kowal", 39, lublin);

        Ex1_Address wawa = new Ex1_Address(02300, "warszawa", "1000lecia", 123);

        Ex1_Person adamNowak = new Ex1_Person("Adam", "Nowak", 65, wawa);

        System.out.println("__JK__");
        System.out.println(janKowal.getPersonData());

        System.out.println("\n__MK__");
        System.out.println(mariaKowal.getPersonData());

        System.out.println("\n__AN__");
        System.out.println(adamNowak.getPersonData());

    }
}
