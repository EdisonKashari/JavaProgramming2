package day_08_LogicalOperatorsIf;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int num1 = 65;

        boolean divisibleBy2 = num1 % 2 == 0;
        boolean divisibleBy3 = num1 % 3 ==0;
        boolean divisibleBy4 = num1 % 5 ==0;

        System.out.println(num1 + " is divisible by 2: " + divisibleBy2 );// if the remainder of a number divided by 2 is zero,then it's evenly
        System.out.println(num1 + " is divisible by 3: " + divisibleBy3);
        System.out.println(num1 + " is divisible by 5: " + divisibleBy4);



        /* Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true */
    }
}
