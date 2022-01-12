package day_22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        //index of elemnts 0 1 2     0 1 3 4    0 1 2  3  4
        int[][] arr2D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12,13}  };
        // index of array    0           1              2

        for (int i = arr2D.length - 1; i >= 0; i--) {//index number of 1D arrays starting from last index to 0
            for (int j = 0; j < arr2D [i].length; j++) {
                System.out.println(arr2D[i][j]+" ");

            }
            System.out.println();
        }
    }
}
