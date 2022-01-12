package day_11_Switch_Scanner;

import java.util.Scanner;

public class GradeLevel1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        boolean level = age >= 1 && age <=18;
        String text ="";
        if (level){
            if (age>=1&&age<=5){
                text ="Elementary school ";
            }else if (age>=6&& age<=8){
                text ="Middle school";
            }else if (age>=9&&age<=12){
                text ="High school";
            }else if (age>=13&&age<=16){
                text ="College";
            }else {
                text ="Grad School";
            }

        }else{
          text = "Invalid grade level given";
        }
        System.out.println(text);


        System.out.println("------------------------------------------");

        if (level){
            switch (age){
                case 1: case 2: case 3: case 4: case 5:
                    text = "Elementary school ";
                    break;
                case 6: case 7: case 8:
                    text ="Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    text ="High school";
                    break;
                case 13: case 14: case 15: case 16:
                    text ="College";
                    break;
                default:
                    text ="Grad School";
            }


        }else{
            text = "Invalid grade level given";
        }
        System.out.println(text);


        System.out.println("-------------------------");

        switch (age){
            case 1: case 2: case 3: case 4: case 5:
                text = "Elementary school ";
                break;
            case 6: case 7: case 8:
                text ="Middle school";
                break;
            case 9: case 10: case 11: case 12:
                text ="High school";
                break;
            case 13: case 14: case 15: case 16:
                text ="College";
            case 17: case 18:
                text ="Grad School";
            default:
                text ="Invalid grade level given";
        }
        System.out.println(text);

        input.close();
        /*Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both*/
    }
}
