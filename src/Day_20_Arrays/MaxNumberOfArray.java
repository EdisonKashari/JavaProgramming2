package Day_20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
       int [] number= {1,8,45,14,65};
       int max= number[0];


        for (int i = 0; i > number.length; i++) {
            if (number[i]>max){
                max+=number[i];
            }
            System.out.println(Arrays.toString(number));
        }



    }
}
