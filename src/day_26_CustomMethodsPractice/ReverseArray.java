package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int array []= {1,2,3,4,5};

        int []arr= reverseArray(array);
        System.out.println(Arrays.toString(arr));
    }
    //    reverses the given array,returns a new array
    public static int[] reverseArray(int [] array){
        int[]result = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0;j++, i--) {
                   result[j]=       array[i];
                   // if we like [j++]
        }
        return result;
    }
    //    reverses the given array,returns a new array
    public static double[] reverseArray(double [] array){
        double[]result = new double[array.length];

        for (int i = array.length - 1,j=0; i >= 0;j++, i--) {
            result[j]=       array[i];
            // if we like [j++]
        }
        return result;
    }
    //    reverses the given array,returns a new array
    public static char[] reverseArray(char [] array){
        char[]result = new char[array.length];

        for (int i = array.length - 1,j=0; i >= 0;j++, i--) {
            result[j]=       array[i];
            // if we like [j++]
        }
        return result;
    }

    //    reverses the given array,returns a new array
    public static String[] reverseArray(String [] array){
        String[]result = new String[array.length];

        for (int i = array.length - 1,j=0; i >= 0;j++, i--) {
            result[j]=       array[i];
            // if we like [j++]
        }
        return result;
    }








}
