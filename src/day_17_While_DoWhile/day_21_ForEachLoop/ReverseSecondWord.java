package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String [] word = sentence.split(" ");
       String reverse = "";
        for (int i = word[1].length()-1; i >= 0; i--) {
            reverse += word[1].charAt(i);
        }
        System.out.println(reverse);

        word[1]=reverse;

        System.out.println(Arrays.toString(word));
        for (String each : word) {
            System.out.print(each+" ");
        }

    }
}
/**
 *  Write a program that can reverse the second word of the sentence
 *             Ex:
 *                 sentence = "I Love Java";
 *
 *             output:
 *                 I evoL Java
 */