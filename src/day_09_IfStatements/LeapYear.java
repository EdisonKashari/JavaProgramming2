package day_09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2001;
        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year " + year+ " is a leap Year");
        }

        if (!leapYear){
            System.out.println("Year " + year+ " is Not a leap Year");
        }
        System.out.println("----------------------------------------");

        if (leapYear){
            System.out.println("Year " + year+ " is a leap Year");
        }else {
            System.out.println("Year " + year+ " is Not a leap Year");
        }
    }
}
