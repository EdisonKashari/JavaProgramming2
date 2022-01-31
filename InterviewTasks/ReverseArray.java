import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};

        int [] result= new int[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--) {

            result[j++]=arr[i]; // j = 0 i  = 5 j = 1 i = 4;



        }

        System.out.println(Arrays.toString(result));
    }
}
