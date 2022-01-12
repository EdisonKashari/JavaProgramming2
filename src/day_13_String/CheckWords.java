package day_13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println("Enter third word");
        String word3 = input.next();

        int result1 = word1.length();
        int result2 = word2.length();
        int result3 = word3.length();

        if (result1==result2 && result2 == result3){
            System.out.println("All words are same length");
        }else if(result1 == result2 || result2 == result3 ){
            System.out.println("Not Same or Different lengths");
        }else{
            System.out.println("All different length");
        }
      input.close();



        /*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"*/
    }
}
