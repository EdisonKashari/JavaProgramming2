package day_17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry with me?" );
        String answer = scan.nextLine();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer,please re-enter");
            answer=scan.nextLine();
        }
        if (answer.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbuy");
        }

/*Task:
    1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no*/
    }
}
