package Ch17_Salary.providers;

import Ch17_Salary.io.InputHelper;
import Ch17_Salary.models.Employee;

public class EmployeeProvider {
    public static Employee getEmployeeFromUser() {
        String firstName = InputHelper.getText("Podaj imie");
        String lastName = InputHelper.getText("Podaj nazwisko");
        int salary = InputHelper.getPositiveNumber("Podaj zadobki (wartość dodatnia)");
        return new Employee(firstName, lastName, salary);
    }
}
