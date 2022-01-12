package day_35_Encapsulation.encapsulation;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Edison","Cydeo",90,'F','A');
       // student1.setGender('M');
        student1.study();
        System.out.println(student1);
    }
}
