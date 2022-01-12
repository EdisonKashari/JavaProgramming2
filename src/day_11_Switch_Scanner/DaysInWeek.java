package day_11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
        int number = 3;

        switch (number){ //1,2,3,4,5,6,7. == only

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // exits the switch after executing the case block
            case  4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:// only executed if none of the case blocks are matching

                System.out.println("invalid number");
                //we don't to give break statement for the last block

        }

    }
}
