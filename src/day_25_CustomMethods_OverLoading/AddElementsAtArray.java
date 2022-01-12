package day_25_CustomMethods_OverLoading;

import java.util.Arrays;

public class AddElementsAtArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        arr = addElement(arr, 6);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------------");

        double[] arr1 = {1.5, 5.4, 7.5, 1.5};

        arr1=addElement(arr1,2.5);


        System.out.println(Arrays.toString(arr1));

        System.out.println("--------------------------------------------------------------------------");
        String[] names = {"Tatiana", "Edy", "Lebron"};
        names = addElement(names, "Alan");
        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------------------------------------------");

        char [] result = {'E','D','R'};
        result = addElement(result,'I');
        System.out.println(Arrays.toString(result));


    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int j = 0;
        for (String each : array) {
            result[j++] = each;

        }
        result[j] = element;
        return result;

    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int j = 0;
        for (char each : array) {
            result[j++] = each;

        }
        result[j] = element;
        return result;


    }
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int j = 0;
        for (double each : array) {
            result[j++] = each;

        }
        result[j] = element;
        return result;


    }

    }

/*  Task2:
        1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array*/