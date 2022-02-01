package day_43_Abstract.Employee;

public   final class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+getJobTitle()+" is writing the code");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" "+ getJobTitle()+" is sleeping 4 hours");

    }

}
