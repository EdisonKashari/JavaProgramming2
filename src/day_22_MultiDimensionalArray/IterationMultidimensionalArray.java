package day_22_MultiDimensionalArray;

public class IterationMultidimensionalArray {
    public static void main(String[] args) {
        //index of elemnts 0 1 2     0 1 3 4    0 1 2  3  4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
       // index of array    0           1              2

       for (int i = 0;i < arr2D.length;i++){//index number of elements


           for (int j = 0; j < arr2D[i].length; j++) {//index number of elements
               System.out.print(arr2D[i][j]+" ");
           }
           System.out.println();
       }
    }
}
