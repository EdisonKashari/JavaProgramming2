package day_16_ForLoopPractice.day_19_LoopPractices;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter radius of the circle");
            double radius=scan.nextDouble();
            if(radius<=0){
                System.out.println("Invalid Entry for the radius of the circle ");
                System.exit(0);
            }

            double PI=3.14;
            double diameter= radius*2;
            double area = PI*radius*radius;
            double perimeter= diameter*PI;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("invalid answer,please re enter yes/no");
                answer = scan.nextLine();


            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;

            }


        }
        scan.close();
    }
}
/*Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
*/