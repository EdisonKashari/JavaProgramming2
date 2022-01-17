package day_39_Recap.StudentTask;

public class StudentObject {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Ali47$ Muhtar",25,'M',125,"Sdet","Oxford",'B');

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Alan",27,'M',147,"Developer","Rutgers",'A');

        CydeoStudent cydeoStudent = new CydeoStudent("Edison",31,'M',222,"QA","Cydeo",'A',25,10,"Java");


        System.out.println(graduateStudent);
        System.out.println(undergraduateStudent);
        System.out.println(cydeoStudent);


        graduateStudent.earlyBird();
        graduateStudent.study();

        undergraduateStudent.drink();
        undergraduateStudent.eat();
        undergraduateStudent.sleep();
        undergraduateStudent.study();

        cydeoStudent.drink();
        cydeoStudent.sleep();
        cydeoStudent.drink();

    }
}
