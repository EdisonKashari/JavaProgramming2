package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        String[] group1 = {"Ali","Layan","Aysenur"};
        String[] group2 = {"Maria","Aygun","Duygu","Suat","Valerie"};


        String [] students = new String[group1.length+group2.length];//we created this array to make sure we have enough capacity for 1and 2 array
       int i =0;
        for (String each : group1) {
            students[i++]=each;

        }

        for (String each : group2) {

            students[i++]=each;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------");

        char[] ch1 = {'A','B','C'};
        char [] ch2 = {'D','E','F'};

        char [] result = new char[ch1.length+ch2.length];

        int j =0;

        for (char each : ch1) {
            result[j++]=each;
        }

        for (char each : ch2) {
            result[j++]=each;

        }

        System.out.println(Arrays.toString(result));

    }
}
