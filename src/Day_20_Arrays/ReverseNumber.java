package Day_20_Arrays;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {

        int [] number = {1,2,3,4,5};
          int [] reversedNumber = new int[number.length];

        for (int i =number.length - 1,j=0 ; i >=0 ; i--,j++) {
           reversedNumber[j] += number[i];


        }
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(reversedNumber));

    }
}



/* Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
*/