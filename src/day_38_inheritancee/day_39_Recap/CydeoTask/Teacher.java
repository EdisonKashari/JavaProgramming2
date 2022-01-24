package day_38_inheritancee.day_39_Recap.CydeoTask;

public class Teacher extends Employee {


    public Teacher(String name, int age, char gender, int employeeId, int salary) {
        super(name, age, gender, employeeId, salary, "Teacher");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is teaching");
    }


}
