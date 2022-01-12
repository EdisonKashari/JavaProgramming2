package day_14_String;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();



        char firstChar= word.charAt(0);


        if (firstChar>='1' && firstChar<='9'){
            System.out.println("first character is digit");
        }else if (firstChar>='a'&& firstChar<='z'){
            System.out.println("first character is lowercase letter");
        }else if (firstChar>='A'&& firstChar<='Z'){
            System.out.println("first character is uppercase letter");
        }else  {
            System.out.println("first character is special character");

        }



        /* Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"*/
    }
}
