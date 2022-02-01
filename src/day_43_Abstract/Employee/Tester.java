package day_43_Abstract.Employee;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+ getJobTitle() + " is testing the software");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" " + getJobTitle()+" is sleeping 4 hours");

    }

    public void systemTesting(){
        System.out.println(getName() + " "+ getJobTitle()+" is doing smoke testing");
    }
}