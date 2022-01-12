package day_18_NestedLoop;

import java.util.Scanner;

public class RoomReservation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           int price = 120;
           int price2 = 100;
           int price3 = 80;
           int total = 0;
           int howManyNights = 0;
        while (true) {
           System.out.println("Wich bedroom do you want?");
           String bedrom = scan.nextLine();


           System.out.println("How many nights is staying");
           howManyNights = scan.nextInt();

           System.out.println("would you like to reserve another room");
           String anotherRoom = scan.next();
           while (!(anotherRoom.equalsIgnoreCase("yes") || anotherRoom.equalsIgnoreCase("no"))) {
               System.out.println("invalid answer,please re enter yes/no ");
               anotherRoom = scan.next();

           }

           if (bedrom.equals("King Bed")) {
               total = price * howManyNights;
           } else if (bedrom.equals("Queen Bed")) {
               total = price2 * howManyNights;
           } else if (bedrom.equals("Single Bed")) {
               total = price3 * howManyNights;
           }
while (!(bedrom.equals("King Bed")|| bedrom.equals("Queen Bed") || bedrom.equals("Single Bed") && anotherRoom.equals("yes") )){
    System.out.println("invalid answer,re enter correct answer");

    scan.nextLine();

    System.out.println("Wich bedroom do you want?");
     bedrom = scan.nextLine();
    System.out.println();
    System.out.println("How many nights is staying");
    howManyNights = scan.nextInt();
    System.out.println("would you like to reserve another room");
    anotherRoom = scan.next();


}
           if (anotherRoom.equals("no")) {
               System.out.println(total);
               break;
           }

        }

        /* Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry*/
    }
}
