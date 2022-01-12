package Arrays;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int [] numbers = {5,45,25,89,47};
        int max = numbers[0];
        int min = numbers[0];

        for (int i  = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
if (numbers[i]<min){
    min=numbers[i];
}

        }
        System.out.println("max number is: "+max);
        System.out.println("min number is: "+min);

        System.out.println("------------------------------------------------");
int [] number1 = {25,58,47,28,100};
int max1 = number1 [0];

        for (int each : number1) {

            if (each>max1){
                max1=each;
            }
        }
        System.out.println(max1);
    }
}
