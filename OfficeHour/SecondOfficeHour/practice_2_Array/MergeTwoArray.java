package SecondOfficeHour.practice_2_Array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] num1 ={1,2,3,4,5};
        int[] num2 = {6,7,8,9,10};

        int [] result = new int[num1.length+num2.length];
int i =0;
        for (int each : num1) {
            result[i++]=each;
        }
        for (int each : num2) {
            result[i++]=each;
        }
        System.out.println(Arrays.toString(result));

    }
}
