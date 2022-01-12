package day_17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Do you want to reserve a Room? yes/no ");
        String reserve=scan.next();

        int price=0;
        String roomType="";
        scan.nextLine();

        while (!(reserve.equals("yes")||reserve.equals("no"))){
            System.out.println("Invalid answer,please re-enter yes/no");
            reserve=scan.next();
        }
        if (reserve.equals("yes")){
            System.out.println("Wich type of room do you wants?");
            roomType=scan.nextLine();


            while (!(roomType.equals("King Bed") || roomType.equals("Queen Bed") || roomType.equals("Single Bed"))){
                System.out.println("invalid answer,please re-enter the answer");
              roomType=scan.nextLine();
            }
            if (roomType.equalsIgnoreCase("King Bed")){
             price = 120;
            }else if (roomType.equalsIgnoreCase("Quuen Bed")){
               price=100;
            }else if (roomType.equalsIgnoreCase("Single Bad")){
                price = 80;
            }
            System.out.println("You succefully reserved "+ roomType + " room and the total is "+ price);





        }else if (reserve.equalsIgnoreCase("no")){
            System.out.println("have a nice day");
        }

scan.close();

        /* Create a class called RommReservation, write a program for the room reservation, your program asks the user wants
        to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/
    }
}
