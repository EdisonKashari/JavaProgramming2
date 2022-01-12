package day_17_While_DoWhile;

import java.util.Scanner;

public class FourOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        System.out.println("Enter a operator");
        char ch = scan.next().charAt(0);

       while (!(ch=='*'|| ch=='/' || ch=='+' || ch=='-')){
           System.out.println("Invalid,re-enter operator");
           ch=scan.next().charAt(0);
       }
       if (ch=='*'){
           System.out.println(num1*num2);

       }else if (ch=='/'){
           System.out.println(num1/num2);
       }else if(ch=='+'){
           System.out.println(num1+num2);
       }else {
           System.out.println(num1-num2);
       }
       scan.close();

    }
}
/*write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)*/