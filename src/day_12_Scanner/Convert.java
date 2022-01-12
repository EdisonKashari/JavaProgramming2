package day_12_Scanner;

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = input.nextInt();

      int centTodollar = cents/100;
      int remainder = cents -(centTodollar*100);

        System.out.println(cents + " cents equal to: " + centTodollar + " dollars and "+ remainder + " cents.");

        input.close();

        /*Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents*/
    }
}
