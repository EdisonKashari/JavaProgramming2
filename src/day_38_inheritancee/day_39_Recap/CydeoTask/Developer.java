package day_38_inheritancee.day_39_Recap.CydeoTask;

public class Developer  extends Employee {
    public Developer(String name, int age, char gender, int employeeId, int salary) {
        super(name, age, gender, employeeId, salary, "Developer");
    }

    @Override
    public void work() {
        System.out.println(getName()+" is coding");
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+  getName()+" is fixing bugs");
    }


}
