package day_17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ask the user to enter your name");
        String name = scan.nextLine();

        scan.nextLine();
        System.out.println(" Ask the user to enter your gender");
       String gender= scan.nextLine();
        while (!(gender.equals("male") || gender.equals("female"))){
            System.out.println("Invalid Gender,re-enter your gender male/female");
        }
        System.out.println("Ask the user if he/she is married(Yes/No)");
       String married= scan.nextLine();
        while (!(married.equals("yes") || married.equals("no"))){
            System.out.println("Ask the user if he/she is married(Yes/No");
            married=scan.nextLine();
        }
        System.out.println("Enter your age");
        int age = scan.nextInt();

        while (!(age>=18 && age<=120)){
            System.out.println("Invalid number,re-enter your age");
            scan.nextInt();
        }
        System.out.println("Enter how many miles drives in a day?");
        double miles= scan.nextDouble();
        while (!(miles>0 && miles>5)){
            System.out.println("Invalid number,re-enter your miles");
            scan.nextDouble();
        }
        System.out.println("Do you want a full coverage/liability");
        String coverage= scan.nextLine();

        System.out.println("had any accidents or claims in past 5 years (Yes/No)");
        String accidents=scan.nextLine();
        while (!(accidents.equals("yes") || accidents.equals("no"))){
            System.out.println("invalid answer,please re-enter yes/no");
            accidents=scan.nextLine();
        }
        System.out.println(" car has an anti-theft device (Yes/No)");
            String theft = scan.next();

        while (!(theft.equals("yes") || theft.equals("no"))){
            System.out.println("invalid answer,please re-enter yes/no");
            theft=scan.next();
        }
if (age<25){

}

     /*

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


*/
    }
}
