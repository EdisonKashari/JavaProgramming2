package day_19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        while (true){
            System.out.println("Enter your score");
            int score = scan.nextInt();


            String result = "";
            if (score<=100 && score>=90){
                result="A";
            }else if(score<=89 && score>=80){
                result="B";
            }else if(score<= 79 && score>= 70){
                result = "C";
            }else if (score<= 69 && score>= 60){
                result = "D";
            }else if(score <= 59 && score >= 0){
                result = "F";
            }else {
                System.out.println("Invalid Entry");
                System.exit(0);

            }
            System.out.println(result);

            System.out.println("Do you like to continue");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid answer");
                System.exit(0);
            }

           if (answer.equals("no")){
               System.out.println("Thank you for using Cydeo Grade Calculator APP");
               break;
           }



        }
        scan.close();

    }
}
/* Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

*/