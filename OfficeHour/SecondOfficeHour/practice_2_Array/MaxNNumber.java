package SecondOfficeHour.practice_2_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNNumber {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};
        int max=number[0];
        for (int each : number) {

            if (each>max){
                max=each;

            }

        }
        System.out.println(max);
// max number with array list

        ArrayList<Integer> maxNumber = new ArrayList<>();
        maxNumber.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max1 = maxNumber.get(0);

        for (Integer each : maxNumber) {
            if (each>max1);
            max1=each;
        }

        System.out.println(max1);

    }
}
