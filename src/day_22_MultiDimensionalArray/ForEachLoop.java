package day_22_MultiDimensionalArray;

public class ForEachLoop {
    public static void main(String[] args) {
        //index of elemnts 0 1 2     0 1 3 4    0 1 2  3  4
        int[][] arr2D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12,13}  };
        // index of array    0           1              2

        for (int[] each1DArray : arr2D) {
            for (int each2DArray : each1DArray) {
                System.out.println(each2DArray);
            }
            System.out.println();
        }
    }
}
