package day_27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
        int[] array ={10, 10, 20, 30, 40, 30, 30, 30};

      array=  replaceAllElements(array,30,80);

        System.out.println(Arrays.toString(array));

        array = replaceAllElements(array,300,500);
        System.out.println(array);
    }




//replaces all the matching old values of the array with the new value
    public static int[] replaceAllElements(int[]arr,int oldValue,int newvalue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i]= newvalue;
            }
        }
        return arr;
    }

//replaces all the matching old values of the array with the new value
    public static double[] replaceAllElements(double[]arr,double oldValue,double newvalue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i]= newvalue;
            }
        }
        return arr;
    }

    //replaces all the matching old values of the array with the new value
    public static char[] replaceAllElements(char[]arr,char oldValue,char newvalue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i]= newvalue;
            }
        }
        return arr;
    }

   //replaces all the matching old values of the array with the new value
    public static String[] replaceAllElements(String[]arr,String oldValue,String newvalue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldValue)){
                arr[i]= newvalue;
            }
        }
        return arr;
    }
















}


/* RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement,
        integer newElement. The method replaces all the element of the array that matching with the given old
        element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays*/