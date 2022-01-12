package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysListCollection {
    public static void main(String[] args) {

// sort
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);


        System.out.println(list);

        System.out.println("----------------------------------------------");
// reverse
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("-------------------------------------------------------");
        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3,4,1);
        System.out.println(list3);

        System.out.println("-------------------------------------------------------------");
// min and max
        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println(max);
        System.out.println(min);

        // replace all the elements





    }
}
