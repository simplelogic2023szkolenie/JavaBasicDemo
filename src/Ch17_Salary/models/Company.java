package Ch17_Salary.models;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void displaySalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Company salaries sum: " + sum);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
