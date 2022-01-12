package day_14_String;

import java.util.Scanner;

public class StringMethods5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println("invalid");
            input.close();
        }

        /*Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/
    }
}
