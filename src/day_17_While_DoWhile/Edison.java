package day_17_While_DoWhile;
import java.util.Scanner;
public class Edison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");
        String reserve = scan.next();

        scan.nextLine();
        String roomType = "";
        int price = 0;

        while(!(reserve.equalsIgnoreCase("yes") || reserve.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry. Please re-enter yes/no");
            reserve = scan.nextLine();
        }


        if (reserve.equalsIgnoreCase("yes")){
            System.out.println("which room type do you want?");
            roomType= scan.nextLine();

            while (!(roomType.equalsIgnoreCase("king bed") || roomType.equalsIgnoreCase("queen bed") || roomType.equalsIgnoreCase("single bed"))){
                System.out.println("invalid room type. Please re-enter the room type");
                roomType = scan.nextLine();
            }

            if (roomType.equalsIgnoreCase("king bed")){
                price = 120;
            }else if (roomType.equalsIgnoreCase("queen bed")){
                price = 100;
            }else if (roomType.equalsIgnoreCase("single bed")){
                price = 80;
            }
            System.out.println("You successfully reserved " + roomType + " room and the total price is $" + price);


        }else if (reserve.equalsIgnoreCase("no")){
            System.out.println("have a nice day");

        }


        scan.close();
    }
}
