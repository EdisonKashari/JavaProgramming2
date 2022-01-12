package day_14_String;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods9 {
    public static void main(String[] args) {
        String str =" xcodeX";

        String toUpper = str.toLowerCase();
        String replace = toUpper.replace("x","a");

        System.out.println(replace);

        System.out.println("-----------------------------------");

        String result = str.replace("x","a").replace("X","a");

        System.out.println(result);






        /* Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
*/
    }
}
