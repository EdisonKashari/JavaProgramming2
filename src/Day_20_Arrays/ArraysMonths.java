package Day_20_Arrays;

import java.util.Arrays;

public class ArraysMonths {
    public static void main(String[] args) {
        String months []= {"January","February","March","April","May","June","July","" +
                "August","September","October","November","December"};//0~11

        System.out.println(Arrays.toString(months));

        int number = 5;

        if (number<0 || number>12){
            System.out.println("invalid number");
            System.exit(0);
        }
        System.out.println(months[number-1]);


        System.out.println("-----------------------------------");
        String months1 []= {"January","February","March","April","May","June","July","" +
                "August","September","October","November","December"};//0~11
/*

        System.out.println(months1[0]);
        System.out.println(months1[1]);
        System.out.println(months1[2]);
        System.out.println(months1[3]);
        System.out.println(months1[4]);
        System.out.println(months1[5]);
        System.out.println(months1[6]);
        System.out.println(months1[7]);
        System.out.println(months1[8]);
        System.out.println(months1[9]);
        System.out.println(months1[10]);
        System.out.println(months1[11]);


 */

        for (int i = 0;i<months1.length;i++){// i :represents the index numbers of array starting from 0
            System.out.println(months1[i]);

        }

            System.out.println("--------------------------");

            for (int i = months1.length-1;i >=0 ;i--);{



        }

    }
}
