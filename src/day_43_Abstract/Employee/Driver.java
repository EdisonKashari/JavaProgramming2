package day_43_Abstract.Employee;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+ getJobTitle() +" is driving");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" "+ getJobTitle()+" is sleeping 8 hours");

    }
}
