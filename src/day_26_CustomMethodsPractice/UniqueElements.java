package day_26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique = uniqueElements(arr);

        System.out.println(Arrays.toString(unique));

        double [] arr1 ={1.0,1.5,5,4,7,4,7,5,6};
        double[] unique2= uniqueElements(arr1);

        System.out.println(Arrays.toString(unique2));
    }

//returns unique elements of the array a new array
    public static int [] uniqueElements(int[] array){

        int [] result ={};//is temporary new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the element is unique
              result=  ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }

    //returns unique elements of the array a new array
    public static double[] uniqueElements(double[] array){

        double [] result ={};//is temporary new int[0]
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the element is unique
                result=  ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }

    //returns unique elements of the array a new array
    public static char[] uniqueElements(char[] array){

        char [] result ={};//is temporary new int[0]
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the element is unique
                result=  ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
    //returns unique elements of the array a new array
    public static String[] uniqueElements(String[] array){

        String [] result ={};//is temporary new int[0]
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the element is unique
                result=  ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
}



