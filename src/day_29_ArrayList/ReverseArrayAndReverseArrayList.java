package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndReverseArrayList {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int[] reverse = new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; j++,i--) {
            reverse[j]=array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reverseList.add(each);
        }
        System.out.println(reverseList);

    }
}
