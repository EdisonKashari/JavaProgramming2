package day_12_Scanner;

import java.util.Scanner;

public class PlaceAndOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = input.nextLine();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter their first name: ");
        String firstName = input.next();

        System.out.println( name +", your order for "+ quantity+" "+ firstName +" has been places. Your total is " + (quantity*price)+".");

        input.close();

        /* PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
*/
    }
}
