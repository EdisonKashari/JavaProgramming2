package day_13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        int result = word.length();


        if (result == 5 ){
            System.out.println(word.charAt(word.length()-1)+""+word.charAt(word.length()-2)+""+word.charAt(word.length()-3)+""+
                    word.charAt(word.length()-4)+""+word.charAt(word.length()-5));

        }else if (result<5 ){
            System.out.println("To short");
        }else{
            System.out.println("To long");
        }

        /*Create a class called Reverse, write a program that will reverse a string. Your program should reverse a string
        only 5 characters long. If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.
*/
    }
}
