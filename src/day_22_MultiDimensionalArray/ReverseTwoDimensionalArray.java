package day_22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

        int [][] array = { {1,2,3}, {4,5,6}};
        int [][] reverse = new int[array.length][array[1].length];
        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = array[i].length-1; j >= 0; j--) {
reverse[array.length-1-i][array[i].length-1-j]=array[i][j];


            }
/* int[][] array = {{1, 2, 3}, {4, 5, 6}};
int [][] reverse = new int[array.length][array[1].length];
        for (int i = array.length-1; i >= 0; i--) {

            for (int j = array[i].length-1 ; j >= 0; j--) {
               reverse[array.length-1-i][array[i].length-1-j]=array[i][j];
            }

        }
        System.out.println(Arrays.deepToString(reverse));*/

        }
        System.out.println(Arrays.deepToString(reverse));

    }
}
/**
 *  Write a program that can reverse a two dimensional array (return new array)
 * 		Ex:
 * 			array = { {1,2,3}, {4,5,6}};
 *
 *
 * 		output:
 * 			reverse = { {6,5,4}, {3,2,1},};
 */