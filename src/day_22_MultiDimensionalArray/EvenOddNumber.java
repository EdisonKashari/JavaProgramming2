package day_22_MultiDimensionalArray;

public class EvenOddNumber {
    public static void main(String[] args) {
        int[][] arr2D = {{5,7,4,5},{10,8,3}};
        int even = 0;
        int odd = 0;
        for (int[] arr1D : arr2D) {
            for (int elements : arr1D) {
                if (elements % 2 ==0){
                   even++;
                }
                if (elements % 2 !=0){
                   odd++;
                }
            }


        }
        System.out.println("Count even: "+even);
        System.out.println("Count odd: "+ odd);

    }
}
/*Write a program that can count the total odd and even numbers from a two dimensional array*/