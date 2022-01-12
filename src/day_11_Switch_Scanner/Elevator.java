package day_11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {



        String number ="four";
        String select ="";

        boolean floor = number == "one" || number== "two" ||number =="three";

        if (floor){
            if (number== "one"){
                select = "Floor 1 selected. Companies: Lobby, Verizon, Starbuks";

            }else if (number == "two"){
                select = "Floor 2 selected. Companies: Cybertek, NASA, Intelstat";
            }else{
                select = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }


        }else{
            System.out.println("invalid floor");
        }
        System.out.println(select);

        System.out.println("----------------------------------------");

        switch (number){
            case "one":
                select = "Floor 1 selected. Companies: Lobby, Verizon, Starbuks";
                break;
            case "two":
                select = "Floor 2 selected. Companies: Cybertek, NASA, Intelstat";
                break;
            case "three":
               select= "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                select="invalid floor";




        }
        System.out.println(select);

        System.out.println("-------------------------------");

        if (floor){
            if (number== "one"){
                select = "Floor 1 selected. Companies: Lobby, Verizon, Starbuks";

            }else if (number=="two"){
                select = "Floor 2 selected. Companies: Cybertek, NASA, Intelstat";
            }else{
                select= "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else{
            System.out.println("invalid floor");
        }

        /* Create a class called Elevator. A variable named floorNumber is given,
        write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed */
    }
}
