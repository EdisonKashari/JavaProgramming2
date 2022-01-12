package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";

  String word[]= sentence.split(" ");
        System.out.println(Arrays.toString(word));

            String reverse = "";
            for (int i = word.length-1; i >=0 ; i--) {
                 reverse+=word[i]+ " ";
            }
            System.out.print(reverse);


    }
}
/**
 *  Write a program that can reverse a sentence
 *             Ex:
 *                 sentence = "Today is a good day to learn Java";
 *
 *             output:
 *                 Java learn to day good a is Today
 */