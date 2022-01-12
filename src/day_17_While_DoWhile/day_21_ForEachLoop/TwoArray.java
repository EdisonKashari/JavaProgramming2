package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {

        int [] num1 = {1,2,3,4};
        int [] num2 = {5,6};

        int[] num3 = new int[num1.length + num2.length];
         int count=0;

        for (int each1 : num1) {
            num3[count]=each1;
            count++;
        }

        for (int each2 : num2) {
            num3[count]=each2;
            count++;
        }
        System.out.println(Arrays.toString(num3));


    }
}
