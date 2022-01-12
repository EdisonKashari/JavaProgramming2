package Arrays;

import java.util.Arrays;

public class PracticeArrays2 {
    public static void main(String[] args) {
        int[] number = {10,20,50,70};//size= 4

        System.out.println(Arrays.toString(number));


        System.out.println("-------------------------------------------");

        int[]scores=new int[5];

        scores[0]=10;
        scores[scores.length-1]=58;
        scores[2]=30;
        scores[3]=40;
        scores[1]=50;

        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------------------------------------------------------");

        String [] month={"January","February","March","April","May","June","July","August","September","October","November","December"};

        for (int i = 0; i < month.length; i++) {

            System.out.print(month[i]+" ");

        }
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------------");

for (int i = month.length-1;i>=0;i--){////reverse the array
    System.out.print(month[i]+" ");
}

    }
}
