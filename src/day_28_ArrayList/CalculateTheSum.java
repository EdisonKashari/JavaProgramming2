package day_28_ArrayList;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int sum= 0;
        for (int i = 0; i <(number); i++) {

            sum+=i;


        }
        System.out.print(sum);
        /* write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
*/
    }
}
