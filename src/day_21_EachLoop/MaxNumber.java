package day_21_EachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int [] num = {45,47,14,54,78,1,4,7};
        int max=0;
        for (int each : num) {
            if (each>max){
                max=each;

            }

        }
        System.out.println(max);
    }
}
