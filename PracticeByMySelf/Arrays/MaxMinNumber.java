package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        int [] numbers = new int[10];
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {


            if (numbers[i] > max) {
                max = numbers[i];

            }

            if (numbers[i] < min) {
                min = numbers[i];
            }


        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("Max num is = "+max);
        System.out.println("Min num is = "+min);



    }
}
