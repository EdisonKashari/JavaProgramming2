package day_17_While_DoWhile;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int i = 0;
        while(i>=0){
            System.out.println("Enter a number: ");
            i = scan.nextInt();

            sum +=i;
            if(i < 0){
                break;
            }
            System.out.println(sum);
        }


    }
}
/* Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
*/