package day_12_Scanner;

//import java.util.*; // wild import:imports everything from the package
import java.util.Scanner;//regular import: imports one class
public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int num = input.nextInt();

        String results ="";

        if (num>=1 && num<=7){
         results =   (num==1)? "Monday" :(num==2)? "Tuesday" :(num==3)?"Wednesday" :(num==4)?"Thursday" :(num==5)? "Friday"
                    :(num==6)? "Saturday" : "Sunday";

        }else{
            results ="Inavalid Number";
        }
        System.out.println(results);

        input.close();


    }
}
