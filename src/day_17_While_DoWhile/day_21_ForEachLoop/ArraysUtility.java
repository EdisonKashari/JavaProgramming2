package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(nums);//hashcode bc we have to do by explicite to print a array to string
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[1]);//we don't need to use toString because we need to print only element,not all elements of the array

        System.out.println("-------------------------------------------");

        int[] scores={95,45,7,8,47,58,101};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);//{7,8,45,47,58,95,101} sort start from min number to max

        System.out.println(Arrays.toString(scores));

        System.out.println("min Score"+scores[0]);
        System.out.println("Max score :"+ scores[scores.length-1]);

        String [] names ={"Lebron","Stephen","Davis","Alan"};

        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String [] words = {"Anna","ANNa"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));


        System.out.println("------------------------------");
//equals()

        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

      boolean r2=  Arrays.equals(arr1,arr2);

        System.out.println(r2);


        System.out.println("------------------------------------------------");

        char[] ch1 = {'a','c','b'};
        char [] ch2 = {'b','a','c'};

        Arrays.sort(ch1);// a,b,c
        Arrays.sort(ch2);//a,b,c

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("Anagram: " + anagram);



    }
}
