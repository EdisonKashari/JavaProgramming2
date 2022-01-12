package day_25_CustomMethods_OverLoading;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[ ] arr1 = {5,7,8,9,10,20};
        int[]  arr2 = {1,2,4,15,21};
        int[] result = mergeOfArrays(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }

    public static int[] mergeOfArrays (int arr1[],int arr2[]){
        int count=0;
        int[]arr3=new int[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        return arr3;
    }

    }




