package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers = removeElement(numbers, 2);
        System.err.println(Arrays.toString(numbers));
    }


    //removes the index  from the array,return a new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index:" + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            {
                if (i == index) {// if the element of array is matching with the element at given index
                    continue;
                }
                result[j++] = array[i];
            }


        }

        return result;
    }

    //removes the index  from the array,return a new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index:" + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            {
                if (i == index) {// if the element of array is matching with the element at given index
                    continue;
                }
                result[j++] = array[i];
            }


        }

        return result;
    }

    //removes the index  from the array,return a new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index:" + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            {
                if (i == index) {// if the element of array is matching with the element at given index
                    continue;
                }
                result[j++] = array[i];
            }


        }

        return result;
    }

    //removes the index  from the array,return a new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index:" + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            {
                if (i == index) {// if the element of array is matching with the element at given index
                    continue;
                }
                result[j++] = array[i];
            }


        }

        return result;
    }

}





