package day_18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            System.out.println("Would you like to enter another number");
            String word = scan.nextLine();

            while (!(word.equals("yes") || word.equals("no"))){
                System.out.println("Please re enter, Would you like to enter another number");
                word=scan.nextLine();

            }

            if (word.equals("no")){
                break;
            }
        }
    }

}
/* Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps*/