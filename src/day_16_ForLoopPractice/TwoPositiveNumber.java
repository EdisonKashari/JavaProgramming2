package day_16_ForLoopPractice;

import java.util.Scanner;

public class TwoPositiveNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive number");
        int first = input.nextInt();
        int second = input.nextInt();
        int result = 0;

       if ( first> 0 && second> 0){

           for (int i = 1; i <=first ; i++) {
               result+=second;
           }
       }else {
           System.out.println("invalid");
       }
        System.out.println("result = " + result);
       input.close();
        /*Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200*/
    }
}
