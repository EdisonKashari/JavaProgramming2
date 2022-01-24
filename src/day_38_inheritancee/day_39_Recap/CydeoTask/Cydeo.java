package day_38_inheritancee.day_39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester= new Tester("Edison",31,'M',124,125000);
        System.out.println(tester);

        Developer developer = new Developer("Muhtar",32,'M',125,200000);

        System.out.println(developer);


        Teacher teacher = new Teacher("Asya",28,'F',201,124000);

        System.out.println(teacher);


        Student student = new Student("Kerem",38,'M',147,"Java");

        student.study();

        student.setAge(35);
      //  student.getAge();

        System.out.println(student);

        System.out.println("------------------------------------------------------------------------");

        tester.work();
        developer.work();
        teacher.work();

        tester.creatingTicket();
        developer.fixingBugs();
        teacher.drink();


    }
}
