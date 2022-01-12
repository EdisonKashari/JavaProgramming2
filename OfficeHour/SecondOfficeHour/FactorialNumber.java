package SecondOfficeHour;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
       int result = 1; // because the last number will be 1

        if (number>2){

            for (int i = number;i>=1;i--){
                result *= number;// result = result*i 5

            }

        }else {
            result=number;
        }
        System.out.println("factorial of number is: "+result);


    }
}
/* input
* output: 120 (5! = 5 * 4 * 3 * 2 * 1= 120 ) */