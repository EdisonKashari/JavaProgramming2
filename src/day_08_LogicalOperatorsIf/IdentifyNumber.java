package day_08_LogicalOperatorsIf;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number1 = 200;


        boolean positiveNumber = number1 >0 ;
        boolean negativeNumber =  number1 < 0;
        boolean zeroNumber = number1 == 0;

        System.out.println(number1 +" is positive number: " + positiveNumber);
        System.out.println(number1 + " is negative number: " + negativeNumber);
        System.out.println(number1 + " is 0: "+ zeroNumber);

        /*Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false */
    }
}
