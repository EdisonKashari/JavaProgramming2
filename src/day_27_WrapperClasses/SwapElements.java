package day_27_WrapperClasses;

import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
       arr= swapElements(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] swapElements(int[]arr,int i,int j){
//arr[i]=(arr[i]+ arr[j]) - (arr[j] = arr[i]);
//return arr;
        int  result=arr[i];
        arr[i]=arr[j];
        arr[j]=result;

return arr;
//return result;
    }


}
//int [] temp = arr[i];
//arr[i] = arr[j];
//arr[j] = temp;
// arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);

/*Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
*/
