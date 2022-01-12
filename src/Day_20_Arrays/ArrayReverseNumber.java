package Day_20_Arrays;

import java.util.Arrays;

public class ArrayReverseNumber {
    public static void main(String[] args) {
int number[]=new int[101];
int conunt = 0;

        for (int i = number.length; i <= 1; i--,conunt--) {

            number[i]=conunt;

        }
        System.out.println(Arrays.toString(number));
    }
}
