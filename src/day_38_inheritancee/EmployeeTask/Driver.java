package day_38_inheritancee.EmployeeTask;

public class Driver extends Employee{
    public Driver(String name, String jobTitle, String companyName, int age, int id, double salaryName, char gender) {
        super(name, jobTitle, companyName, age, id, salaryName, gender);
    }

    @Override
    public void work() {
        System.out.println(name+" is driving");
    }
}
