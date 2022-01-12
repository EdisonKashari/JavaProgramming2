package day_28_ArrayList;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        int max=-12546;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {

            System.out.println("Enter a number");

            int number=input.nextInt();
            if (number>max){
               max = number;


            }

        }
        System.out.println("maximum= "+ max );




        /*Write a program that asks the user to enter a number for 5 times
        return the maximum number*/
    }
}
