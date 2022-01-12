package Day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers wold you like to enter?");
        int lengh = scan.nextInt();

        if (lengh <= 0) {
            System.out.println("invalid enter");
            System.exit(0);

        }

        int[] numbers = new int[lengh];// array needs to have enough capacity to contain all the elements user going

        for (int i = 0; i < lengh; i++) {//i:0,1....
            System.out.println("Enter a number");
           numbers[i]= scan.nextInt();//each input user provided during each execution of the loop,will be assigned to the indexes of the array

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
