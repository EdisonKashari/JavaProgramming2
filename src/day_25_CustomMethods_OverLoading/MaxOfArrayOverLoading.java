package day_25_CustomMethods_OverLoading;

import java.lang.reflect.Array;

public class MaxOfArrayOverLoading {

    public static void main(String[] args) {

        int [] num ={15,20,35,200};
        int max =maxArray(num);
        System.out.println(max);

        double [] num1 = {2.1,5.4,2.5,6.5,4.1};

        double max1 = maxArray(num1);
        System.out.println(max1);
        
    }
    
    public static int maxArray(int [] number){
        int max = number[0];
        for (int each : number) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
    public static short maxArray(short [] number){
        short max = number[0];
        for (short each : number) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
    public static byte maxArray(byte [] number){
        byte max = number[0];
        for (byte each : number) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
    public static long maxArray(long [] number){
        long max = number[0];
        for (long each : number) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
    public static double maxArray(double [] number){
        double max = number[0];
        for (double each : number) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
    public static float maxArray(float [] number){
        float max = number[0];
        for (float each : number) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
   
    
    }
    
    


