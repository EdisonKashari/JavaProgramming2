package day_22_MultiDimensionalArray;

public class PrintEachElements {
    public static void main(String[] args) {

        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };
        for (int[][][][][][][] arr7 : arr8D) {
            for (int[][][][][][] arr6 : arr7) {
                for (int[][][][][] arr5 : arr6) {
                    for (int[][][][] arr4 : arr5) {
                        for (int[][][] arr3 : arr4) {
                            for (int[][] arr2 : arr3) {
                                for (int[] arr1 : arr2) {
                                    for (int elements : arr1) {
                                        System.out.print(elements+" ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/* Given the array:
            int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };


        Use for each loop to print each elements*/