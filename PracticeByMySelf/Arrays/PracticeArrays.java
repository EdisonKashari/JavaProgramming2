package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you like to enter");
        int length = scan.nextInt();
        if (length<=0){
            System.out.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length];//[25,10,15,45] array needs to have enough capacity for all numbers user put

        for (int i = 0; i < length; i++) {

            System.out.println("Enter a number");
         numbers[i] = scan.nextInt();// each input user provided during each execution of the loop,will be assigned to the indexes

        }

        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
