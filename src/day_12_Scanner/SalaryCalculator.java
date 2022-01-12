package day_12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        String result ="";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        int hourlyRate = input.nextInt();

        System.out.println("Enter how many hours work in the week");
        int hoursWeek = input.nextInt();

        System.out.println("Enter state tax");
        double stateTax = input.nextDouble();

        System.out.println("Enter federal tax");
        double federalTax = input.nextDouble();

        double salary = hourlyRate * hoursWeek * 52;


        System.out.println("Salary : = " + salary);
        System.out.println("State Tax : = "+ salary * stateTax/100);
        System.out.println("Federal Tax : = " + salary * federalTax/100);
        System.out.println("Total Tax : = " + (stateTax + federalTax) );
        System.out.println("Net Incame : = " + (salary-(stateTax+federalTax)));

        input.close();




        /*SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome*/
    }
}
