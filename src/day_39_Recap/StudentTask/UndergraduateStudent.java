package day_39_Recap.StudentTask;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName()+" is still studying");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating breakfast");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking coffe");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping to much");
    }


}
