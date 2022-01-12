package SecondOfficeHour.practice_2_Array;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        int [] number={1,2,3,4,5,6};
        int [] reverse = new int[number.length];

        for (int i = number.length - 1,j=0; i >= 0; j++,i--) {
            reverse[j]=number[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
