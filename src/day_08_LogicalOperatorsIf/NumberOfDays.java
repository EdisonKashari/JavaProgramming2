package day_08_LogicalOperatorsIf;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 5;

        boolean monthWith28Days = number == 2;
        boolean monthWith30Days = number==4 || number ==6 || number==9 || number==11;
        boolean monthWith31Days = !monthWith28Days && !monthWith30Days;

        if (monthWith28Days){
            System.out.println("28 Days");
        }
        if (monthWith30Days){
            System.out.println("30 Days");
        }
        if (monthWith31Days){
            System.out.println("31 Days");
        }






        /*Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2  */

    }
}
