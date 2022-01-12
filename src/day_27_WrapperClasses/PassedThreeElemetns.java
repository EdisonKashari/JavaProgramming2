package day_27_WrapperClasses;


import utilities.ArraysUtility;

import java.util.Arrays;

public class PassedThreeElemetns {
    public static void main(String[] args) {
        int [] arr={10, 20, 30, 40, 50};
        arr=passedThreeArrays(arr,2,100);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] passedThreeArrays(int[] array,int index,int element){

       array[index]=element;
       return array;
    }

}
/*1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
*/