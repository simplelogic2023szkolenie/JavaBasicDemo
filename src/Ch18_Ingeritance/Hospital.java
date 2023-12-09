package Ch18_Ingeritance;

public class Hospital {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.firstName = "mat";
        worker.lastName = "mtad";
        worker.salary = 123;
        worker.showSalary();

        Boss boss = new Boss();
        boss.firstName = "adam";
        boss.lastName = "nowak";
        boss.salary = 1231;
        boss.bonus= 100;
        boss.showSalary();

        CompanyOwner companyOwner = new CompanyOwner();
        companyOwner.firstName = "adam";
        companyOwner.lastName = "nowak";
        companyOwner.salary = 1231;
        companyOwner.bonus= 100;
        companyOwner.ownerBonus = 123456;
        companyOwner.showSalary();
        companyOwner.introduceOwner();

        Nurse nurse = new Nurse();
        nurse.firstName = "mat";
        nurse.lastName = "mtad";
        nurse.salary = 123;
        nurse.overtime = 5;
        nurse.showSalary();
    }
}
