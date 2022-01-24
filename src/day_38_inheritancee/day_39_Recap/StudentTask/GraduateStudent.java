package day_38_inheritancee.day_39_Recap.StudentTask;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName()+" study to much and is Gratuated");
    }
    public void earlyBird(){
        System.out.println(getName()+" is early birds");
    }
}

/*
Create the following sub classes of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary
 */
