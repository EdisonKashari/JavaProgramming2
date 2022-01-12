package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class SortNumber {
    public static void main(String[] args) {
        int[] number = {1,8,47,64,58,74,99,24};
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);

        System.out.println(Arrays.toString(number));
    }
}
// Write a program that sort the array of integer in descending order