package Day_20_Arrays;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int [] numbers ={10,9,5,4,20,13,7};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
