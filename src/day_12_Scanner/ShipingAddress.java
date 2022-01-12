package day_12_Scanner;

import java.util.Scanner;

public class ShipingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName =input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();


        System.out.println("Enter your Street name:");
        String streetname = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();


        System.out.println("Enter your zip code: ");
        String zip = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetname = " + streetname);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);

        input.close();





    }
}


// Enter your full name
// Enter your building number
// Enter your Street name
// Enter your city name
// Enter your state
// Enter your zip code

// Display shipping address
