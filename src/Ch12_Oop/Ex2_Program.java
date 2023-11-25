package Ch12_Oop;

public class Ex2_Program {
    public static void main(String[] args) {
        Ex2_Employee employee = new Ex2_Employee();
        employee.firstName = "Mateusz";
        employee.lastName = "Tadla";
        employee.age = 33;

        employee.printEmployeeInfo();
        System.out.println(employee.getEmployeeInfo());
    }
}
/*
Napisz klasę Employee, która przechowuje trzy pola:
- Imię
- Nazwisko
- Wiek

Oraz metodę printInfo() która wypisze imię, nazwisko i wiek pracownika

Następnie utwórz klasę Company i w niej metodę public static void main(String[] args)
w której wykorzystasz klasę Employee do utworzenia trzech obiektów przechowujących
dane trzech różnych pracowników (wymyśl imię, nazwisko i wiek każdego z nich)

Na koniec wyświetl imie, nazwisko i wiek, każdego z pracowników przy użyciu metody printInfo()
 */