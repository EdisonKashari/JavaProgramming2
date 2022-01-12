package day_22_MultiDimensionalArray;

public class MinMaxNumber {
    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3},{4,5,6},{7,8,9,10}};
        int max=-2145467;
        int min=2145467;
        for (int[] arr1D : arr2D) {
            for (int elements : arr1D) {



                    if (elements > max) {
                        max = elements;
                    }
                    if (elements < min) {
                        min = elements;
                    }
                }
            }
            System.out.println(max);
            System.out.println(min);



    }
}
/* Write a program that can find the minimum and maximum numbers from a two dimensional array*/