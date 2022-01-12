package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
           //COPYOF COPY ELEMNT FROM ARRAY START FROM BIGGINING,START FROM FIRSTINDEX
        String[] students = {"Elif","Lionel","Lebron","Stephen","David","James","Aaron","Daniel"};
        String[] earlyBirds = Arrays.copyOf(students,3);///TURN A NEW ARRAY OBJECT

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("------------------------------------------------");


        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[]  ch2= Arrays.copyOfRange(ch1,2,6+1);

        System.out.println(Arrays.toString(ch2));

        System.out.println("---------------------------");


        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        int [] result = Arrays.copyOfRange(scores,7,8);

        System.out.println(Arrays.toString(result));

        int [] result2= Arrays.copyOfRange(scores,3,scores.length);

        System.out.println(Arrays.toString(result2));
    }
}
