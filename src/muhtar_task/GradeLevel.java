package muhtar_task;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 16;
        String level = "";

        if (number>=1 && number<= 18){
            if (number>=1 && number <=5){
                level = "Elementary School";
            }else if (number>=6 && number <=8){
                level = "Middle School";
            }else if (number>=9 && number <=12){
                level = "High School";
            }else if (number>=13 && number <=16){
                level = "College";
            }else{
                level = "Grad School";
            }




        }else {
            level = "invalid grade";
        }
        System.out.println(level);
        /* Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/
    }
}
