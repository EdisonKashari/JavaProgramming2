package Day_20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];

        char ch = 'A';
        for (char i = 0 ; i<letters.length;i++,ch++){
            letters[i]=ch;

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------------------------");

        char[] letters2 = new char[26];

        char cha = 'Z';
        for (int i = 0; i <letters2.length ; i++,cha--) {//reverse the alphabet
            letters2[i]=cha;

        }
        System.out.println(Arrays.toString(letters2));

    }
}
