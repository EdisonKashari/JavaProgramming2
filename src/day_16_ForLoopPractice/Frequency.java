package day_16_ForLoopPractice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();
        System.out.println("Enter a char");
       String ch = input.next();
       int frequency = 0;


        for (int i = 0; i <=str.length()-1; i++) {
            if (ch.equalsIgnoreCase(""+str.charAt(i))){
                frequency++;
            }





        }
        System.out.println("frequency = " + frequency);
input.close();

        /*Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4*/
    }
}
