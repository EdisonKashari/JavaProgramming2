package SecondOfficeHour.practice_2_Array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String [] color ={"Yellow","Blue","Purple"};


        System.out.println(color.length);//how many index array has


        String[] color2 = new String[3];

        color2[0]="Red";
        color2[1]="Orange";
        color2[2]="Green";
        System.out.println(Arrays.toString(color));
        System.out.println(Arrays.toString(color2));
        System.out.println(color[1]);




        //equals
        int[] num =new int[3];
        num[0]=25;
        num[1]=21;
        num[2]=10;
        System.out.println(Arrays.toString(num));

        int[] num2 ={24,25,4};


        System.out.println("Arrays.equals(num,num2) = " +Arrays.equals(num,num2));

        //sort

        Arrays.sort(num2);

        System.out.println(Arrays.toString(num2));




    }
}
