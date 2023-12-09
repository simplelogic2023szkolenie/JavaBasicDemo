package Ch17_Salary.providers;

import Ch17_Salary.models.Company;

public class CompanyProvider {
    public static Company initializeCompany(int employeeQuantity){
        Company company = new Company();
        for (int i = 0; i < employeeQuantity; i++) {
            company.addEmployee(EmployeeProvider.getEmployeeFromUser());
        }
        return company;
    }
}
