package day_13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String first = input.nextLine();

        System.out.println("Enter second string");
        String second = input.nextLine();

        int totalChar1 = first.length();
        int totalChar2 = second.length();

        if (totalChar1>totalChar2){
            System.out.println(first + " is the longest");
        }else if (totalChar2>totalChar1){
            System.out.println(second+ " is the longest");
        }else{
            System.out.println("");
        }
input.close();


// int totalChars = s1.length();


    }
}
