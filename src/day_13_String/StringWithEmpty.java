package day_13_String;

import java.util.Scanner;

public class StringWithEmpty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.nextLine();

        int totalWord = word.length();

        if (totalWord==0){
            System.out.println("string is empty");
        }else if (totalWord>3){
            System.out.println(word.charAt(word.length() -3)+""+word.charAt(word.length() -2)+""+word.charAt(word.length() -1));
        }else if(totalWord<=3){
            System.out.println(word);
        }else{
            System.out.println("invalid string");
        }
input.close();
        /* Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
*/
    }
}
