package day_14_String;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter firt words");

        String words = input.nextLine();


        System.out.println("Enter second word");
        String word2 = input.next();
        String result = words.substring(1)+word2.substring(1);
        System.out.println(result);
        input.close();






        /* Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana*/
    }
}
