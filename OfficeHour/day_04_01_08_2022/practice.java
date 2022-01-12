package day_04_01_08_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

      method3(50);

      //  System.out.println(method3(50));

    }

    public static String method3(int num){

        if (num<0){
            return "less than 0";
        }else if (num<50){
            return "les than 50";
        }else if (num<100){
            return "less than 100";
        }else {
            return "other";
        }
    }
}
