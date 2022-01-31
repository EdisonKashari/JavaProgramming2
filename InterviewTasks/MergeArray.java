import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 ={5,6,7};


        int [] result = new int[arr1.length+ arr2.length];

        int a = 0;
        for (int each : arr1) {
            result[a++]=each;


        }

        for (int each: arr2) {
            result[a++]=each;

        }

        System.out.println(Arrays.toString(result));


    }
}
