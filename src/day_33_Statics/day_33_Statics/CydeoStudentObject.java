package day_33_Statics.day_33_Statics;

public class CydeoStudentObject {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Edison",31,1224,25,10,'M','C');
       cydeoStudent1.printSchoolName();
       cydeoStudent1.printProgLanguage();
       cydeoStudent1.attendClass();
       cydeoStudent1.study();

        System.out.println(cydeoStudent1);


    }


}
