package Arrays;

import java.util.Arrays;

public class FirstPracticeWithArray {
    public static void main(String[] args) {
       int numbers[]=new int[4];//we will use this array if we know how many elements we have but we don't know what they elements are
       numbers[0]=4;
       numbers[1]=3;
       numbers[3]=1;//value will be 0 becase the value will be skipped
       numbers[3]=2;



      //  System.out.println(names); hashcode
        System.out.println(Arrays.toString(numbers));//to print array


        System.out.println("---------------------------------------------------------------------");


        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","saturday","Sunday"};//if we know how many elements,and each elements

        System.out.println(Arrays.toString(days));

        int number =5;

        if (number<1||number>7){
            System.out.println("invalid number");
            System.exit(0);//terminate the system,"stop the code to run"
        }

        System.out.println(days[number-1]);


        System.out.println("------------------------------------------------------------------------------");


        String [] month={"January","February","March","April","May","June","July","August","September","October","November","December"};


        int count = 5;

        if (count<0||count>12){


        }
        System.out.println(month[count-1]);


    }
}
