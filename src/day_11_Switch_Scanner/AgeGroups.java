package day_11_Switch_Scanner;

import java.util.Scanner;

public class AgeGroups {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = input.nextInt();
        String text ="";

        switch (age){
            case 1: case 2:
                text = "infant";
                break;
            case 3: case 4: case 5:
                text = "Todler";
                break;
            case 6: case 7: case 8: case 9:
                text= "Kid";
                break;
            case 10: case 11: case 12:
                text ="Pre-Teen";
                break;
            case 13: case 14: case 15: case 16: case 17:
                text ="Teenager";
                break;
            case 18: case 19: case 20:
                text="Young Adult";
                break;
            default:
                text ="Invalid Number";

        }
        System.out.println(text);
        input.close();


        /* 6. write a program that can define the age groups of a person
                 age groups are:
                        infant ( 1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                NOTE: MUST USE switch statement
*/
    }
}
