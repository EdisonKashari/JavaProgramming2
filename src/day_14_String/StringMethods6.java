package day_14_String;

import java.util.Scanner;

public class StringMethods6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String w1 = input.nextLine();
        String w2 = input.nextLine();


       if (w1.charAt(w1.length()-1)==w2.charAt(0)){
           System.out.println(w1+w2.substring(1));
           input.close();
       }
        /* Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight*/

    }
}
