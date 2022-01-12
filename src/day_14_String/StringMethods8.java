package day_14_String;

import java.util.Scanner;

public class StringMethods8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();




        if (word.charAt(0)=='x'){
            System.out.println(word.replaceFirst("x","a"));
            input.close();
        }

        /* Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
*/
    }
}
