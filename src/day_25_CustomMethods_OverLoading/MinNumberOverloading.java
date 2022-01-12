package day_25_CustomMethods_OverLoading;

public class MinNumberOverloading {
    public static void main(String[] args) {

        int [] num1={1,5,7,8};
       int min=minArray(num1);
        System.out.println(min);

        double [] num2={2.1,5.4,8.4,2.0} ;
        double min1 =minArray(num2);
        System.out.println(min1);
    }

    public static int minArray(int [] number){
        int min = number[0];
        for (int each : number) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
    public static double minArray(double [] number){
        double min = number[0];
        for (double each : number) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
    public static float minArray(float [] number){
        float min = number[0];
        for (float each : number) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
    public static byte minArray(byte [] number){
        byte min = number[0];
        for (byte each : number) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
    public static short minArray(short [] number){
        short min = number[0];
        for (short each : number) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
    public static long minArray(long [] number){
        long min = number[0];
        for (long each : number) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
}
