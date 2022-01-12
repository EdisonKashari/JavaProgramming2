package day_28_ArrayList;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 2147483647;


        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");

            int number=input.nextInt();
            if (number<min){
                min=number;
            }


        }

        System.out.println("min = " + min);
        /* Write a program that asks the user to enter a number for 5 times.

         */
    }
}
