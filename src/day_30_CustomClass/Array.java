package day_30_CustomClass;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int [] arr= new int[5];
int j =0;

        for(int i =1;i<=arr.length;i++){
           arr[j++]=i;


        }
        System.out.println(Arrays.toString(arr));


    }
}


