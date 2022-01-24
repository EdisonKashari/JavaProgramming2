package day_38_inheritancee.day_39_Recap.CydeoTask;

public class Tester extends  Employee{
    public Tester(String name, int age, char gender, int employeeId, int salary) {
        super(name, age, gender, employeeId, salary, "QA");
    }

    @Override
    public void work() {
        System.out.println(getName()+" is finding the bugs");
    }

    public void creatingTicket(){
        System.out.println(getJobTitle()+" " + getName() + " is creating ticket");
    }



}
