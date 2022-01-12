package day_30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1= new Student();

        student1.setInfo("Edison",'M',31,123456789,'A');

        Student student2 = new Student();
        student2.setInfo("Alan",'M',25,987654321,'B');

        Student student3 =new Student();
        student3.setInfo("Mike", 'F',24,2547,'C');

        Student student4 = new Student();
        student4.setInfo("Carlos",'M',38,2458,'D');

        Student student5 = new Student();
        student5.setInfo("Joana",'F',25,7487,'E');

        Student[] students= {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");

        ArrayList<Student>earlyBirds = new ArrayList<>();//grade A
        ArrayList<Student>angryBirds = new ArrayList<>();//grade

        for (Student student : students) {

            if (student.grade=='A'){
                earlyBirds.add(student);

            }else {
                angryBirds.add(student);
            }

        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);



      /*  System.out.println(student2);
        student2.sleep();
        student2.drink();


        System.out.println(student1);
        student1.code();
        student1.eat();*/

    }
}
