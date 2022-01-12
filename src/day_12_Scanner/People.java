package day_12_Scanner;

import java.util.Scanner;

public class People {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people they live with:");
        int people = input.nextInt();
        String result ="";

        if (people>=1 && people <= 10){
            if (people>=1 && people<=3){
                result = "Live with less than 3 people";
            }else if (people>=3 && people <= 6){
                result = "Live with 3 - 6 people";
            }else{
                result = "Live with more than 6 people";
            }

        }else{
            result = "invalid number";
        }
        System.out.println(result);

        input.close();

        /* Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"*/
    }
}
