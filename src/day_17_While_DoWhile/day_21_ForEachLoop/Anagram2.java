package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String word1 = "edison";
        String word2 = "noside";

        char [] ch1 = word1.toCharArray();
        char [] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        boolean result = Arrays.equals(ch1,ch2);

        System.out.println(result);

    }
}
