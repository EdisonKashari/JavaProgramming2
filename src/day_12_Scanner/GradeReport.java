package day_12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = input.nextInt();
        String result ="";

        if (score>=60 && score<=100){
            if (score>=60 && score<=69){
                result = "A";
            }else if (score >=70 && score <=79){
                result = "B";
            }else if (score>=80 && score<=89){
                result = "C";
            }else if (score >=90 && score<= 95){
                result = "D";
            }else{
                result = "F";
            }

        }else{
           result ="invalid score";
        }
        System.out.println("result = " + result);

        input.close();

        /*GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
             90 ~ 100: excellent
           80 ~ 89   great
           70 ~ 79 good
           60 ~ 69 passed
           0 ~ 59*/

    }
}
