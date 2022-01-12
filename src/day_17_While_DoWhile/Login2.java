package day_17_While_DoWhile;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name and your password");
        for (int i = 1; i <=3 ; i++) {
           String  name=scan.nextLine();
           String password=scan.nextLine();
           if (name.equals("Cydeo")&&password.equals("Cydeo123")){
               System.out.println("Login");
               break;
           }else if (i==3){
               System.out.println("Locked");
           }else {
               System.out.println("Try again");
           }


        }
        scan.close();
    }
}
