package day_37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "ScrumMaster", id, salary, companyName);
    }
}
