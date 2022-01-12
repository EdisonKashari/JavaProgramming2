package day_17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName= scan.nextLine();
        System.out.println("Enter pasword");
        String pasword = scan.nextLine();

        if (userName.equals("Cydeo")&& pasword.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attemps =3;
            while (!(userName.equalsIgnoreCase("Cydeo")&& pasword.equalsIgnoreCase("Cydeo123")&& attemps>0)){
                System.out.println("Invalid pasword,re-enter pasword");
                System.out.println("Enter user name");
                userName=scan.nextLine();
                System.out.println("Enter pasword");
                pasword=scan.nextLine();
                attemps--;
            }
           if (userName.equals("Cydeo")&&pasword.equals("Cydeo123")){
               System.out.println("Logged in");
           }else {
               System.out.println("Your account is locked");
           }
        }




    }
}
