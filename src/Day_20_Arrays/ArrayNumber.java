package Day_20_Arrays;

import java.util.Arrays;

public class ArrayNumber {
    public static void main(String[] args) {

        int number[]=new int[101];
        int count =0;

        for (int i = 0; i <number.length ; i++,count++) {
            number[i]=count;



        }
        System.out.println(Arrays.toString(number));
    }
}
