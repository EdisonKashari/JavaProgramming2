package day_16_ForLoopPractice;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int positive=0;
        int negative=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            if (number>0){
               positive++;
            }else if (number<0){
              negative++;
            }

        }
        System.out.println(positive + " positive and "+negative +" negative");
    }

}
