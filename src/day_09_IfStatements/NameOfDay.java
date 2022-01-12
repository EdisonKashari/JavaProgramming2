package day_09_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        int numday = 5;
        String day;

        if (numday==1){
            day = "Monday";
           // System.out.println("Monday");
        }else if (numday==2){
            //System.out.println("Tuesdy");
            day = "Tuesday";
        }else if (numday==3){
          //  System.out.println("Wednesday");
            day = "Wednesday";
        }else if (numday==4){
           // System.out.println("Thursday");
            day = "Thursday";
        }else if (numday==5){
           // System.out.println("Friday");
            day = "Friday";
        }else if (numday==6){
           // System.out.println("Saturday");
            day = "Saturday";
        }else {
            //System.out.println("Sunday");
            day = "Sunday";
        }
        System.out.println("day = " + day);

    }
}
